package Atividade03;

public class Produto {

	private String nome, codigo, faixaEtaria;
	private int plataforma;
	private float preco;

	public Produto(String nome, String codigo, String faixaEtaria, int plataforma, float preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.faixaEtaria = faixaEtaria;
		this.plataforma = plataforma;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getFaixaEtaria() {
		return faixaEtaria;
	}


	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


	public int getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public void visualizar() {
		String tipo ="";
		
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
		
		System.out.println("\n****************************************************");
		System.out.println("Dados do Game:");
		System.out.println("****************************************************");
		System.out.println("Nome do Jogo: " + this.nome);
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Faixa Etária: " + this.faixaEtaria);
		System.out.println("Plataforma: " + tipo);
		System.out.println("Preço: " + this.preco);
	}
}
