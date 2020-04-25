package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Exemplo2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		Products[] vect = new Products[n];

		for (int i = 0; i < vect.length; i++) {
			in.nextLine();
			String name = in.nextLine();
			double price = in.nextDouble();
			vect[i] = new Products(name, price);

		}

		double soma = 0;

		for (int i = 0; i < vect.length; i++) {

			soma += vect[i].getPrice();

		}
		double media = soma/n;
		System.out.printf("Media é: %.2f%n", media);

		in.close();

	}
}
