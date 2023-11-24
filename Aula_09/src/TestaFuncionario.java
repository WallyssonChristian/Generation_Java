
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Aline", 1, 8000.0f, 2000.0f);
		System.out.println("Salário Calculado: " + g1.calcularSalario());
		Vendedor v1 = new Vendedor("Amanda", 2, 4000.0f, 0.05f);
		System.out.println("Salário Calculado " + v1.calcularSalario());
		
		g1.visualizar();
		v1.visualizar();
	}
}