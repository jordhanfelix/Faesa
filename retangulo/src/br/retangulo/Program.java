package br.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program extends Retangulo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Retangulo retan = new Retangulo();

		System.out.println("Entre com a Largura e Altura do RETANGULO");
		retan.altura = in.nextDouble();
		retan.largura = in.nextDouble();

		System.out.print("Area = " + String.format("%.2f", retan.area()));
		System.out.println();
		System.out.print("Perimetro = " + String.format("%.2f", retan.perimetro()));
		System.out.println();
		System.out.print("Diagonal = " + String.format("%.2f", retan.diagonal()));

		in.close();
	}

}
