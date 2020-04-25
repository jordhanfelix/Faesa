package curso;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		String a = " [0,25]";
		String b = " (25,50]";
		String c = " (50,75]";
		String d = " (75,100]";

		double x = in.nextDouble();

		if (x >= 0 && x <= 25) {
			System.out.println("Intervalo " + a);
		} else if (x >= 25 && x <= 50) {
			System.out.printf("Intervalo " + b);
		} else if (x >= 50 && x <= 75) {
			System.out.printf("Intervalo " + c);
		} else if (x >= 75 && x <= 100) {
			System.out.printf("Intervalo " + d);
		} else {
			System.out.println("Fora do Intervalo.");
		}

		in.close();
	}

}
