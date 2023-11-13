package Atividades;

import java.util.Scanner;

public class Atividade04 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		/* Elabore um algoritmo que leia as notas 
		 * de uma classe com 10 participantes durante 
		 * 4 bimestres de um ano. As 4 notas de cada 
		 * participante serão armazenadas em uma linha 
		 * de uma matriz de números reais, logo cada 
		 * linha da matriz serão as notas de um participante. 
		 * Em um vetor de números reais, armazene as médias de 
		 * cada participante e exiba as médias de cada um na tela. */
		
		double[][] alunosNota = new double[10][4];
		double[] mediaAluno = new double[10];
		double totalNota;
		
		//double[][] alunosNota = {{4, 5, 7, 3}, {2.5, 6.5, 4.7, 8}, {10, 8.5, 9.5, 8}, 
		//		{9, 6.5, 7.6, 8.2}, {5, 5, 5, 6.3}, {7, 8, 9, 8.5}, {5.5, 3.5, 2.5, 1}, 
		//		{8, 9, 10, 9.5}, {5.6, 5.8, 6.5, 7}, {7.5, 8.5, 9.5, 10}};              // Matriz Teste
		
		for(int iLinha = 0; iLinha < alunosNota.length; iLinha++) {
			for(int iColuna = 0; iColuna < alunosNota[iLinha].length; iColuna++)  {
				System.out.print("Valor Matriz: ");
				alunosNota[iLinha][iColuna] = leia.nextDouble();
			}
		}
		
		// Criando Vetor com medias
		for(int iLinha = 0; iLinha < alunosNota.length; iLinha++) {
			totalNota = 0;
			for(int iColuna = 0; iColuna < alunosNota[iLinha].length; iColuna++)  {
				totalNota += alunosNota[iLinha][iColuna];
			}
			mediaAluno[iLinha] = totalNota/4;
		}
		
		// Imprimindo Vetor
		System.out.println("Vetor: ");
		for(int i = 0; i < mediaAluno.length; i++)
			System.out.printf("| %.1f ", mediaAluno[i]);
		System.out.println("|");
	}

}
