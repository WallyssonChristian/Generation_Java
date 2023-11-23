package Atividade03;

public abstract class Produto {

	private String nome, codigo;
	private float preco;

	public Produto(String nome, String codigo, float preco) {
		this.nome = nome;
		this.codigo = codigo;
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



	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public void visualizar() {
		
		System.out.println("\n****************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("****************************************************");
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Preço: " + this.preco);
	}
}
