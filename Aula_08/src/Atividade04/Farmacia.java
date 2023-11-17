package Atividade04;

public class Farmacia {

	private String nome, telefone, endereco;
	private int numFuncionario;
	private float faturamentoAnual;
	
	public Farmacia(String nome, String telefone, String endereco, int numFuncionario, float faturamentoAnual) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numFuncionario = numFuncionario;
		this.faturamentoAnual = faturamentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public float getFaturamentoAnual() {
		return faturamentoAnual;
	}

	public void setFaturamentoAnual(float faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}
	
	public void visualizar() {
		
		System.out.println("\n****************************************************");
		System.out.println("Dados da Farmacia:");
		System.out.println("****************************************************");
		System.out.println("Nome do Farmacia: " + this.nome);
		System.out.println("Número: " + this.telefone);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Numero de Funcionários: " + this.numFuncionario);
		System.out.println("Faturamento Anual: " + this.faturamentoAnual);
	}
}
