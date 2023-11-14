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
	}

}
