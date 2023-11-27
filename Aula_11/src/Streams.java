import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> cidades = Arrays.asList("São Paulo", "São Paulo", "São Paulo", "Campinas", "São José dos Campos", "Atibaia", "Pereira Barreto", "Monguagá");
		
		List<Integer> numerosCubo = numeros.stream().map(n -> n*n*n).collect(Collectors.toList());

		System.out.println(numerosCubo);
		
		List<Integer> numerosPares = numeros.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		
		System.out.println(numerosPares);
		
		long cidadesIniciandoP = cidades.stream().filter(c -> c.toString().startsWith("P")).count();
		
		System.out.println(cidadesIniciandoP);
		
		List<String> cidadesUnicas = cidades.stream().distinct().collect(Collectors.toList());
		
		System.out.println(cidadesUnicas);
	}

}
