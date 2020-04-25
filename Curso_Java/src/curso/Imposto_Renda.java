package curso;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_Renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		double s = in.nextDouble();

		double calc;

		if (s <= 2000.00) {
			System.out.println("Isento");
		} else if (s <= 3000.00) {

			calc = (s - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", calc);

		} else if (s <= 4500.00) {

			calc = ((s - 3000) * 0.18) + (1000 * (0.08));
			System.out.printf("R$ %.2f%n", calc);
		} else if (s > 4500) {
			calc = (s - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;

			System.out.printf("R$ %.2f%n", calc);

		}

		in.close();
	}

}
