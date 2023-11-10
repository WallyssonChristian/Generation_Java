package Atividades;

import java.util.Scanner;

public class Atividade04 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade, sexo, categ;
		int tBack = 0, tMulherFront = 0, tHomemMobile = 0, tNBIFull = 0, tPesquisa = 0, tIdade = 0;
		double media;
		char continua = 'S';
		
		while(continua == 's' || continua == 'S') {
			
			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();
			System.out.println("Digite o Sexo: ");
			sexo = leia.nextInt();
			System.out.println("Digite a Categoria: ");
			categ = leia.nextInt();
			
				tPesquisa++;
				tIdade += idade;
				if(categ == 1) {
					tBack++;
				} else if((sexo == 1 || sexo == 4) && categ == 2) {
					tMulherFront++;
				} else if((sexo == 2 || sexo == 5) && (idade > 40) && categ == 3) {
					tHomemMobile++;
				} else if((sexo == 3) && (idade < 30) && categ == 4) {
					tNBIFull++;
				}

			System.out.println("\nDeseja continuar (S/N): ");
			continua = leia.next().charAt(0);
		}
		
		media = ((double) tIdade/tPesquisa);
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n", tBack);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", tMulherFront);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", tHomemMobile);
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d\n", tNBIFull);
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", tPesquisa);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa:  %.2f", media);
	}

}
