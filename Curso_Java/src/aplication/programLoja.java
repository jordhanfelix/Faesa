package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programLoja {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = in.nextLine();
		System.out.print("Preço:");
		double preco = in.nextDouble();

		Product product = new Product(nome, preco);

		product.setNome("computador");
		System.out.println("Update name: " + product.getNome());
		System.out.println();
		System.out.println("Product Data: " + product);

		System.out.println();

		System.out.print("Entre com a quantidade de produtos para ser adicionado no estoque: ");
		int qtd = in.nextInt();
		product.addProduct(qtd);

		System.out.println();
		System.out.println("Update  Data: " + product);

		System.out.println();

		System.out.print("Entre com a quantidade de produtos para ser ''RETIRADO'' no estoque: ");
		qtd = in.nextInt();
		product.removerProduct(qtd);
		System.out.println();
		System.out.println("Update  Data: " + product);

		in.close();
	}

}
