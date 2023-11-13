package Atividades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		int num;

		// Leitura de dados
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um número inteiro não repetido: ");
			numeros.add(leia.nextInt());
		}
		
		// Criando Iterator
		Iterator<Integer> iterator = numeros.iterator();
		
		// Listas dados do set:
		System.out.println("Listar dados do set: " );
		while (iterator.hasNext()) {
			num = iterator.next();
			System.out.println(num);
		}
	}

}
