package entities;

public class Product {

	 String nome;
	private double preco;
	private int quantidade;

	public Product() {

	}

	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}// não foi implementado o setquantidade pois só pode ser mudada a quantidade 
	//conforme utilização do metodo

	public double valorTotal() {

		return preco * quantidade;

	}

	public void addProduct(int quantidade) {
		this.quantidade += quantidade;

	}

	public void removerProduct(int quantidade) {

		this.quantidade -= quantidade;

	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", valorTotal()) + ", " + quantidade + ", unidades total: $ "
				+ valorTotal();
	}

}
