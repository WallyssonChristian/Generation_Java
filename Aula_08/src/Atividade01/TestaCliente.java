package Atividade01;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Stephany", "555-0505-6605", "Decima com a Nona", 18, 2);
		Cliente c2 = new Cliente("Victor", "555-0505-6606", "Decima com a Oitava", 22, 1);

		c1.visualizar();
		c2.visualizar();
	}

}
