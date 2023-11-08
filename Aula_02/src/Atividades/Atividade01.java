package Atividades;

import java.util.Scanner;

public class Atividade01 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float salario, abono;
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Seu novo salário é: " + novoSalario);
	}
}
