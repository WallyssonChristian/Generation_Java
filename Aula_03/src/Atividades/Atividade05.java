package Atividades;

import java.util.Scanner;

public class Atividade05 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int codigo, quantidade;
		double valor_total, valor;
		String produto;
		
		System.out.println("Código do Produto: ");
		codigo = leia.nextInt();
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();

		switch(codigo) {
			case 1:
				valor = 10.00;
				produto = "Cachorro Quente";
				break;
			case 2:
				valor = 15.00;
				produto = "X-Salada";
				break;
			case 3:
				valor = 18.00;
				produto = "X-Bacon";
				break;
			case 4:
				valor = 12.00;
				produto = "Bauru";
				break;
			case 5:
				valor = 8.00;
				produto = "Refrigerante";
				break;
			case 6:
				valor = 13.00;
				produto = "Suco de laranja";
				break;
			default:
				valor = 0;
				produto = "Produto inválido";
		}
		
		valor_total = (quantidade*valor);
		System.out.println("---------------------");
		System.out.printf("Produto: %s\nValor total: R$ %.2f\n4", produto,  valor_total);
		System.out.println("---------------------");
		
	}

}
