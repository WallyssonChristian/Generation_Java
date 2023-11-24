
public class Vendedor extends Funcionario implements CalcularSalario {

	private float comissao;
	
	public Vendedor(String nome, int cargo, float sal, float comissao) {
		super(nome, cargo, sal);
		this.comissao = comissao;
		
	}
	
	public float getComissao() {
		return comissao;
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.comissao);
	}

	@Override
	public float calcularSalario() {
		
		return (this.comissao * this.getSal()) + this.getSal();
	}
}
