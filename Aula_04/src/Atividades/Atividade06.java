package Atividades;

import java.util.Scanner;

public class Atividade06 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, soma = 0, total = 0;
		double media;

		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if((n % 3 == 0) && (n !=0)) {
				soma += n;
				total++;
			}
		} while (n != 0);

		media = ((double) soma/total);
		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f", media);
	}

}
