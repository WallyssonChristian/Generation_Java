package Atividades;

import java.util.Scanner;

public class Atividade07 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int codigo;
		double n1, n2, resultado;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();
		System.out.println("Operação: ");
		codigo = leia.nextInt();

		switch(codigo) {
			case 1:
				resultado = (n1 + n2);
				System.out.printf("O Resultado da Soma é: %.2f", resultado);
				break;
			case 2:
				resultado = (n1 - n2);
				System.out.printf("O Resultado da Subtração é: %.2f", resultado);
				break;
			case 3:
				resultado = (n1 * n2);
				System.out.printf("O Resultado da Multiplicação é: %.2f", resultado);
				break;
			case 4:
				resultado = (n1 / n2);
				System.out.printf("O Resultado da Divisão é: %.2f", resultado);;
				break;
			default:
				System.out.println("Operação Inválida!");
		}
		
	}

}
