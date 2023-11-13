package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();

		// Leitura de dados
		for(int i = 0; i < 5; i++) {
			System.out.print("cor: ");
			cores.add(leia.nextLine());
		}
		
		// Listar todas as cores
		System.out.println("Listar todas as cores: ");
		for(String i: cores) {
			System.out.println(i);
		}
		
		// Ordenar as cores
		System.out.println("\nOrdenar as cores: ");
		cores.sort(null);
		for(String i: cores) {
			System.out.println(i);
		}
	}

}
