package curso;

import java.util.Locale;
import java.util.Scanner;

public class Plano_Cartesiano {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		double x = in.nextDouble();
		double y = in.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem.");

		} else if (x > 0 && y > 0) {
			System.out.println("Q1");

		}else if (x < 0 && y > 0) {
			System.out.println("Q2");

		}else if (x < 0 && y < 0) {
			System.out.println("Q3");

		}else if (x == 0 ) {
			System.out.println("Eixo X");

		}else if (y == 0 ) {
			System.out.println("Eixo Y");

		}else { 
			System.out.println("Q4");
		}

		in.close();
	}
}
