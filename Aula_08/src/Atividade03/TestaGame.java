package Atividade03;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("City Skylines", "55505056605", "14", 1, 80.0f);
		Produto p2 = new Produto("Refactor", "55505056606", "16", 2, 200.0f);

		p1.visualizar();
		p2.visualizar();

	}

}
