
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
public class Set {

	public static void main(String[] args) {
		
		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Abacate");
		frutas.add("Kiwi");
		
		System.out.println(frutas);
		for(var fruta: frutas)
			System.out.println(fruta.hashCode());
		
		System.out.println("A fruta morango existe? " + frutas.contains("Morando"));
		
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		// Criar ArrayList
		ArrayList<String> frutaList = new ArrayList<String>();
		
		// Adicionar todos elementos da coleção HashSet no ArrayList
		frutaList.addAll(frutas);
		// Ordenar elementos
		frutaList.sort(null);
		System.out.println(frutaList);
		
		// Ordenar em ordem decrescente
		frutaList.sort(Comparator.reverseOrder());
		System.out.println(frutaList);
	}

}
