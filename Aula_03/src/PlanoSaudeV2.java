import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome, custo;
		int faixaIdade;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Faixa Etárias: \n"
				+ "1 - De  0 a 10 anos\n"
				+ "2 - De 11 a 29 anos\n"
				+ "3 - De 30 a 45 anos\n"
				+ "4 - De 46 a 59 anos\n"
				+ "5 - De 60 a 65 anos\n"
				+ "6 - Acima de 65 anos\n");
		
		System.out.println("Digite a sua faixa etária: ");
		faixaIdade = leia.nextInt();
		
		switch(faixaIdade) {
			case 1:
				custo = "100,00";
				break;
			case 2:
				custo = "200,00";
				break;
			case 3:
				custo = "300,00";
				break;
			case 4:
				custo = "500,00";
				break;
			case 5:
				custo = "600,00";
				break;
			case 6:
				custo = "1000,00";
				break;
			default:
				custo = "0";
		}

		System.out.printf("%s o seu Plano de Saúde custará R$ %s por mês.", nome, custo);
	}

}
