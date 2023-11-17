package Atividade05;

public class Ingresso {

	private int tipo;
	private String numero, dataEvento, local;
	private float preco;
	
	public Ingresso(String numero, int tipo, String dataEvento, String local, float preco) {
		this.numero = numero;
		this.tipo = tipo;
		this.dataEvento = dataEvento;
		this.local = local;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
public void visualizar() {
	String tipo ="";
	
	switch (this.tipo) {
	case 1:
		tipo = "Inteira";
		break;
	case 2:
		tipo = "Meia";
		break;
	case 3:
		tipo = "VIP";
		break;
	}
	
		System.out.println("\n****************************************************");
		System.out.println("Dados do Ingresso:");
		System.out.println("****************************************************");
		System.out.println("Número do Ingresso: " + this.numero);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: " + this.preco);
		System.out.println("Data do Evento: " + this.dataEvento);
		System.out.println("Local: " + this.local);
	}
}
