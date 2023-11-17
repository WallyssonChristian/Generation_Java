package Atividade06;

public class Curso {

	private String nome, codigo, professor;
	private int duracaoSemanas, alunosInscritos;
	
	public Curso(String nome, String codigo, String professor, int duracaoSemanas, int alunosInscritos) {
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.duracaoSemanas = duracaoSemanas;
		this.alunosInscritos = alunosInscritos;
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

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getDuracaoSemanas() {
		return duracaoSemanas;
	}

	public void setDuracaoSemanas(int duracaoSemanas) {
		this.duracaoSemanas = duracaoSemanas;
	}

	public int getAlunosInscritos() {
		return alunosInscritos;
	}

	public void setAlunosInscritos(int alunosInscritos) {
		this.alunosInscritos = alunosInscritos;
	}
	
	public void visualizar() {
		
			System.out.println("\n****************************************************");
			System.out.println("Dados do Curso:");
			System.out.println("****************************************************");
			System.out.println("Nome do Curso: " + this.nome);
			System.out.println("Codigo do Curso: " + this.codigo);
			System.out.println("Professor: " + this.professor);
			System.out.println("Duração do Curso (Semanas:)" + this.duracaoSemanas);
			System.out.println("Quantidade de Alunos Inscritos: " + this.alunosInscritos);
		}
	
}
