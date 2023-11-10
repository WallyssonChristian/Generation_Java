import java.util.Scanner;

public class Pesquisa {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolMen18 = 0, outros = 0;
		String continua = "S";
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();		
			System.out.println("Digite o seu esporte favorito (1-Fut / 2-Vol / 3-Basq / 4-Outros): ");
			esporte = leia.nextInt();
			
			if(esporte == 1) {
				futebol++;
			}
			
			if(esporte == 2 && idade > 18) {
				voleibolM18++;
			}
			
			if(esporte == 3 && idade < 18) {
				basquetebolMen18++;
			}
			
			if(esporte == 4) {
				outros++;
			}
			
			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de voleibol e são maiores de 18 anos: " + voleibolM18);
		System.out.println("Total de pessoas que gostam de basquetebol e são menores de 18 anos: " + basquetebolMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);
		
	}

}
