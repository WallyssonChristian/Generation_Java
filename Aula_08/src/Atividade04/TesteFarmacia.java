package Atividade04;

public class TesteFarmacia {

	public static void main(String[] args) {

		Farmacia f1 = new Farmacia("DrogaSim", "555-0505-6605", "New City", 9635, 800000.0f);
		Farmacia f2 = new Farmacia("FarmaAfk", "555-0505-6606", "Old City", 2, 1200500.0f);

		f1.visualizar();
		f2.visualizar();

	}

}
