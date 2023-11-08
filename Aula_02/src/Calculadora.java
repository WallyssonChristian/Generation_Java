import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		double num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextDouble();
		System.out.println("Digite o primeiro numero: ");
		num2 = leia.nextDouble();
		
		System.out.println("Soma: " + (num1+num2));
		System.out.println("Subtração: " + (num1-num2));
		System.out.println("Multiplicação: " + (num1*num2));
		System.out.println("Divisão: " + (num1/num2));
		System.out.println("Módulo do numero 1 (Resto da divisão: " + (num1%2));
		System.out.println("Módulo do numero 2 (Resto da divisão: " + (num2%2));
		
		System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(num1)));
		System.out.println("Potência do numero 1 pelo numero 2: " + (Math.pow(num1, num2)));
	

	}
	
}
