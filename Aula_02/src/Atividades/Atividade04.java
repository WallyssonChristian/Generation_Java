package Atividades;

import java.util.Scanner;

public class Atividade04 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		float n1, n2, n3, n4;
		
		System.out.println("Digite n1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite n2: ");
		n2 = leia.nextFloat();
		System.out.println("Digite n3: ");
		n3 = leia.nextFloat();
		System.out.println("Digite n4: ");
		n4 = leia.nextFloat();
		
		float valorFinal = ((n1*n2)-(n3*n4));
		System.out.println("Diferença: " + valorFinal);

	}

}
