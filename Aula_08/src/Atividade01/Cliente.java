package Atividade01;

public class Cliente {

	private String name, telefone, endereco;
	private int idade, sexo;
	
	public Cliente(String name, String telefone, String endereco, int idade, int sexo) {
		this.name = name;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void visualizar() {
		String tipo ="";
		
		switch (this.sexo) {
		case 1:
			tipo = "Masculino";
			break;
		case 2:
			tipo = "Feminino";
			break;
		case 3:
			tipo = "Outro";
			break;
		}
		
		System.out.println("\n****************************************************");
		System.out.println("Dados do Cliente:");
		System.out.println("****************************************************");
		System.out.println("Nome do Cliente: " + this.name);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + tipo);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: " + this.endereco);
	}
}
