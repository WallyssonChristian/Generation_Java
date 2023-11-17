package Atividade02;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Stephany", "555-0505-6605", "Decima com a Nona", 1, 2000.0f);
		Funcionario f2 = new Funcionario("Victor", "555-0505-6606", "Decima com a Oitava", 3, 15000.0f);

		f1.visualizar();
		f2.visualizar();
	}
}
