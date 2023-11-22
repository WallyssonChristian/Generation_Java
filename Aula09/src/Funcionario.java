
public abstract class Funcionario {

	private String nome;
	private int cargo;
	private float sal;
	
	public Funcionario(String nome, int cargo, float sal) {
		this.nome = nome;
		this.cargo = cargo;
		this.sal = sal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.sal);
	}
}
