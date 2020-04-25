package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();
		System.out.println("Insira as medidas do Triangulo (X): ");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		System.out.println("Insira as medidas do Triangulo (Y): ");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();

		
		double areaX = x.area();
		
		double areaY = y.area();

		System.out.printf("A area do Triangulo X é: %.4f%n", areaX);

		System.out.printf("A area do Triangulo Y é: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O triangulo com a maior area é o X");
		} else {
			System.out.println("O triangulo com a maior area é o Y");
		}

		in.close();
	}

}
