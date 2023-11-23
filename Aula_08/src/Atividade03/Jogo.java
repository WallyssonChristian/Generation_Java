package Atividade03;

public class Jogo extends Produto implements CalcularImposto {

	private int plataforma;
	private String faixaEtaria;
	
	public Jogo(String nome, String codigo, float preco, int plataforma, String faixaEtaria) {
		super(nome, codigo, preco);
		this.faixaEtaria = faixaEtaria;
		this.plataforma = plataforma;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		String tipo ="";
		
		System.out.println("Faixa Etaria: " + this.faixaEtaria);

		
		switch (this.plataforma) {
		case 1:
			tipo = "Playstation";
			break;
		case 2:
			tipo = "X-Box";
			break;
		case 3:
			tipo = "Nintendo";
			break;
		}
		System.out.println("Plataforma: " + tipo);
	}

	@Override
	public float calcularImposto() {
		return (float) (this.getPreco()*0.6);
	}

}
