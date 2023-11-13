package Atividades;

import java.util.Scanner;

public class Atividade02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int[] vetorN = new int[10];
		int totalSoma = 0;
		double media;

		for(int i = 0; i < vetorN.length; i++) {
			System.out.print("Valor: ");
			vetorN[i] = leia.nextInt();
			totalSoma += vetorN[i];
		}
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int i = 0; i < vetorN.length; i++) {		
			if(i % 2 != 0)
				System.out.print(vetorN[i] + " ");
		}
		
		System.out.println("\nElementos pares: ");
		for(int i = 0; i < vetorN.length; i++) {		
			if(vetorN[i] % 2 == 0)
				System.out.print(vetorN[i] + " ");
		}
		
		media = ( ((double)totalSoma) / (vetorN.length) );
		
		System.out.println("\nSoma: " + totalSoma);
		System.out.println("Média: " + media);
	}

}
