package Atividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade04 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>(Set.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));

		// Leitura de dados
		System.out.println("Digite o número que você deseja encontrar: ");
		int numFind = leia.nextInt();
				
		// Localização do número
		if (numeros.contains(numFind)) {
			System.out.printf("O número %d foi encontrado!", numFind);
		} else {
			System.out.printf("O número %d não foi encontrado!", numFind);
		}

	}

}
