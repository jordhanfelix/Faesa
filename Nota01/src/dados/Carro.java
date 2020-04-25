package dados;

public class Carro {

	private int idCarro;
	private String modelo;
	private String cor;
	private int ano;

	public Carro(int idCarro, String modelo, String cor, int ano) {

		this.idCarro = idCarro;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public Carro() {

		this.idCarro = 0;
		this.modelo = "";
		this.cor = "";
		this.ano = 0;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
