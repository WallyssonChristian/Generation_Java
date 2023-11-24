
public class Gerente extends Funcionario implements CalcularSalario {

	private float bonus;
	
	public Gerente(String nome, int cargo, float sal, float comissao) {
		super(nome, cargo, sal);
		this.bonus = comissao;
		
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float comissao) {
		this.bonus = comissao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.bonus);
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return this.getSal()+this.getBonus();
	}

}
