package Atividades;

import java.util.Scanner;

public class Atividade03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		float salarioBruto, adicionalNoturno, hrsExtras, descontos;
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		hrsExtras = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		float salarioLiquido = ((salarioBruto + adicionalNoturno + (hrsExtras*5))-descontos);
		System.out.println("Sua média é: " + salarioLiquido);

	}

}
