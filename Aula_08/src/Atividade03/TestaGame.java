package Atividade03;

public class TestaGame {

	public static void main(String[] args) {
		
		Jogo j1 = new Jogo("City Skylines", "55505056605", 80.0f, 1, "14");
		Acessorio a1 = new Acessorio("Dualshock", "55505056606", 200.0f, 2, "Bluetooth");

		j1.visualizar();
		a1.visualizar();
		System.out.println(a1.calcularImposto());

	}

}
