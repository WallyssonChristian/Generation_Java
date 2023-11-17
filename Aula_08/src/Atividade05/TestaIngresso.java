package Atividade05;

public class TestaIngresso {

	public static void main(String[] args) {

		Ingresso i1 = new Ingresso("7953682", 1, "30/02/2025", "New City", 200.0f);
		Ingresso i2 = new Ingresso("25121996", 3, "25/12/2023", "Old City", 1200500.0f);

		i1.visualizar();
		i2.visualizar();

	}

}
