package Atividade03;

public class Acessorio extends Produto implements CalcularImposto {

	private int tipo;
	private String conexao;
	
	public Acessorio(String nome, String codigo, float preco, int tipo, String conexao) {
		super(nome, codigo, preco);
		this.tipo = tipo;
		this.conexao = conexao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getConexao() {
		return conexao;
	}

	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		String tipo ="";

		switch (this.tipo) {
		case 1:
			tipo = "Teclado";
			break;
		case 2:
			tipo = "Controle";
			break;
		case 3:
			tipo = "Headset";
			break;
		}
		
		System.out.println("Tipo do Acessório: " + tipo);
		System.out.println("Conexão: " + this.conexao);
	}

	@Override
	public float calcularImposto() {
		return (float) (this.getPreco()*0.65);
	}

}
