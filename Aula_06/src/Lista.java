import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();

		notas.add((double) 7);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.00);
		
		for(Double nota: notas)
			System.out.println(nota);
		
		System.out.println(notas);
		
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));
		
		System.out.println("Existe o elemento 7? " + notas.contains(7.0));
		
		System.out.println("Elemento na posição 0: " + notas.get(0));
		
		notas.remove(3);
		
		System.out.println(notas);
		
		notas.forEach(System.out::println);
		
		notas.clear();
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
		
	}

}
