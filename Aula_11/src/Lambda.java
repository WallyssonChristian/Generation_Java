import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static int calcular(OperacoesMatematica om, int num1, int num2) {
		return om.executar(num1, num2);
	}
	
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Exibindo dados da lista: ");
		for(var i : numeros) System.out.print(i + " ");
		numeros.forEach(i -> System.out.print(i + " ")); //lambda
		
		System.out.println("\nExibindo todos elementos da lista em dobro: ");
		for(var i : numeros) System.out.print(i + i + " ");
		numeros.forEach(i -> System.out.print(i + i + " ")); //lambda

		System.out.println("\nExibindo todos elementos pares: ");
		for(var i : numeros) if(i % 2 == 0) System.out.print( i + " ");
		numeros.forEach(i -> {if(i % 2 == 0) System.out.print( i + " ");}); //lambda
		
	}

}
