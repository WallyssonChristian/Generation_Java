import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		System.out.println(fila);

		fila.remove();
		
		System.out.println(fila);
		
		System.out.println(fila.peek());
		
		System.out.println(fila);
		
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println("A Maria está na fila?: " + fila.contains("Maria"));
		
		System.out.println("Número de elementos na fila: " + fila.size());
		
		int contador = 0;
		
		for(var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("Maria"))
				System.out.println("Posição: " + contador);
		}
	}

}
