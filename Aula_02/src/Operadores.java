import java.util.Scanner;

public class Operadores {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int num1 = 7, num2 = 4;
		String v1 = "2", v2 = "3";
		
		String nome = "Wally";
		int idade = 26;
		float media = 3.1415f;
		
		int tamanho;
		
		System.out.println("A soma das variáveis numero1 e numero2 é igual a: " + (num1+num2));
		System.out.println("A soma das variáveis valor1 e valor2 é igual a: " + (v1+v2));
		
		System.out.println("meu nome é " + nome + " e eu tenho " + idade + " anos.");
		
		System.out.printf("A média final de %s é %.2f", nome, media); 
		
		System.out.println("\nDigite o tamanho: ");
		tamanho = leia.nextInt();
		
		System.out.println("O valor digitado foi: " + tamanho);
	

	}

}
