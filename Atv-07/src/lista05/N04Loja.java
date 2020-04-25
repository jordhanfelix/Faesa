package lista05;

public class N04Loja {
	private int codigo;
	private String descricao;
	private double precoCompra;
	private double precoVenda;
	private int quantidadeEstoque;
	private int estoqueMinimo;

	public N04Loja(int codigo, String descricao, double precoCompra,
			double precoVenda, int quantidadeEstoque, int estoqueMinimo) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.quantidadeEstoque = quantidadeEstoque;
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoCompra() {
		return this.precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public int getEstoqueMinimo() {
		return this.estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public String toString() {
		return "Lista05_n04 [codigo=" + codigo + ", descricao=" + descricao
				+ ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda
				+ ", quantidadeEstoque=" + quantidadeEstoque
				+ ", estoqueMinimo=" + estoqueMinimo + "]";
	}
}
