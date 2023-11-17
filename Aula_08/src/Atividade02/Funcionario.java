package Atividade02;

public class Funcionario {

	private String name, telefone, endereco;
	private int funcao;
	private float salario;

	public Funcionario(String name, String telefone, String endereco, int funcao, float salario) {
		this.name = name;
		this.telefone = telefone;
		this.endereco = endereco;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	
	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void visualizar() {
		String funcao = "";
		
		switch (this.funcao) {
		case 1:
			funcao = "Caixa";
			break;
		case 2:
			funcao = "Estoquista";
			break;
		case 3:
			funcao = "Limpeza";
			break;
		}
		
		System.out.println("\n****************************************************");
		System.out.println("Dados do Funcionario:");
		System.out.println("****************************************************");
		System.out.println("Nome do Funcionario: " + this.name);
		System.out.println("Salario: " + this.salario);
		System.out.println("Função: " + funcao);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: " + this.endereco);
	}
}
