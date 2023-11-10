package Atividades;

import java.util.Scanner;

public class Atividade02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int totalPar = 0, totalImpar = 0, n;
		for(int c = 1; c <= 10; c++) {			
			System.out.printf("Digite o %dº número: ", c);
			n = leia.nextInt();
			if(n % 2 == 0) {
				totalPar++;
			} else {
				totalImpar++;
			}
		}
		
		System.out.printf("Total de números pares: %d\n", totalPar);
		System.out.printf("Total de números ímpares: %d", totalImpar);
	}

}
