package Atividades;

import java.util.Scanner;

public class Atividade01 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a, b;
	
		System.out.println("Digite o primeiro número do intervalo: ");
		a = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		b = leia.nextInt();
		
		if(a > b) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.printf("No Intervalo entre %d e %d:\n\n", a, b);
			for(int i = a; i <= b; i++) {
				if(i % 3 == 0 && i % 5 ==0) {
					System.out.printf("%d é multiplo de 3 e 5\n", i);
				}
				
			}
		}
	}

}
