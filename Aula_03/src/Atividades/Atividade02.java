package Atividades;

import java.util.Scanner;

public class Atividade02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n;
		String paridade, sinal;
		
		System.out.println("Digite o valor: ");
		n = leia.nextInt();

		if (n % 2 == 0) {
			paridade = "par";
		} else {
			paridade = "ímpar";
		}
		if (n >= 0) {
			sinal = "positivo";
		} else {
			sinal = "negativo";
		}
		
		System.out.printf("O Número é %s e %s!", paridade, sinal);
		
	}

}
