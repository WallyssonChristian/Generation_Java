import java.util.Scanner;

public class TabuadaV2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numero;
		int c = 1;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		while(c <= 10 ) {
			System.out.println(numero + " x " + c + " = " + (numero * c));
			c++;
		}
	}

}
