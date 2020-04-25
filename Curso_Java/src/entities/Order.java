package entities;

import java.util.Date;

public class Order {
	private Date data;
	private Product product;

	public Order(Date date, Product product) {

		this.data = date;
		this.product = product;
		this.product.nome = "tv";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
