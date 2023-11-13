package Atividades;

import java.util.Scanner;

public class Atividade03 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int[][] matrizN = new int[3][3];
		// int[][] matrizN = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Matriz Teste
		int somaDP = 0, somaDS = 0, i = 1;
		
		for(int iLinha = 0; iLinha < 3; iLinha++) {
			for(int iColuna = 0; iColuna <3; iColuna++) {
				System.out.print("Elemento da Matriz: ");
				matrizN[iLinha][iColuna] = leia.nextInt();
			}
		}
		
		// Elementos da Diagonal Principal
		System.out.println("Elementos da Diagonal Secundária: ");
		for(int iLinha = 0; iLinha < matrizN.length; iLinha++) {
			for(int iColuna = 0; iColuna < matrizN.length; iColuna++) {
				if(iLinha == iColuna) {
					System.out.print(matrizN[iLinha][iColuna] + " ");
					somaDP += matrizN[iLinha][iColuna];
				}
			}
		}
		
		// Elementos da Diagonal Secundária
		System.out.println("\nElementos da Diagonal Principal: ");
		for(int iLinha = 0; iLinha < matrizN.length; iLinha++) {
			for(int iColuna = 0; iColuna < matrizN.length; iColuna++) {
				if(iColuna == (matrizN.length-i)) { // EDITAR ISSO AQ
					System.out.print(matrizN[iLinha][iColuna] + " ");
					somaDS += matrizN[iLinha][iColuna];
				}
			}
			i += 1;
		}
		
		// Soma dos Elementos da Diagonal Principal
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDP);
		// Soma dos Elementos da Diagonal Secundária
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDS);
	}

}
