package Atividades;

import java.util.Scanner;

public class Atividade01 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float salario, abono;
		System.out.println("Boas vindas!\n\nEsse programa te auxiliará no cálculo do novo salário após aplicação do abono salarial.");
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Seu novo salário é: R$" + novoSalario);
	}
}
