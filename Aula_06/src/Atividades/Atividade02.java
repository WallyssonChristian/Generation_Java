package Atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		// Leitura de dados
		System.out.print("Digite o número que você deseja encontrar: ");
		int numFind = leia.nextInt();
		
		// Localização do número
		if(numero.indexOf(numFind) != -1) {
			System.out.printf("O número %d está localizado na posição: %d", numFind, numero.indexOf(numFind));
		} else {
			System.out.printf("O número %d não foi encontrado!", numFind);
		}

	}

}
