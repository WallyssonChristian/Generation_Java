package Atividades;

import java.util.Scanner;

public class Atividade01 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int[] vetorN = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int valor = leia.nextInt();
		
		for(int i = 0; i < vetorN.length; i++) {
			if (valor == vetorN[i]) {
				encontrado = true;
				System.out.printf("O numero %d está localizado na posição: %d", valor, i);
				break;
			}
		}
		
		if (!encontrado) {
			System.out.printf("O numero %d não foi encontrado!", valor);
		}
		
	}

}
