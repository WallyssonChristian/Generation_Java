package Atividades;

import java.util.Scanner;

public class Atividade05 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int n, tPositivo = 0;

		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if(n >= 0) {
				tPositivo += n;
			}
		} while (n != 0);

		System.out.printf("A soma dos números positivos é: %d", tPositivo);
	}

}
