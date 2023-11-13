import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "SamaraAlt+3" };
		float[] notas = new float[5];
		
		for( int indice = 0; indice < 6; indice++)
			System.out.println("Posição " + (indice+1) + " = " + pessoas[indice]);

		System.out.println("\n");
		
		for(int indice = 0; indice < 5; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "] = ");
			notas[indice] = leia.nextFloat();
		}
		
		for(int indice = 0; indice < notas.length; indice++) 
			System.out.println("Posição " + indice + " = " + notas[indice]);
		
		Arrays.sort(pessoas);
		
		for( int indice = 0; indice < pessoas.length; indice++)
			System.out.println("Posição [" + indice + "] = " + pessoas[indice]);
		
		for( int indice = pessoas.length - 1; indice >= 0; indice--)
			System.out.println("Posição [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("Localize o elemento Aline: " + Arrays.binarySearch(pessoas, "Aline"));
		
	}

}
