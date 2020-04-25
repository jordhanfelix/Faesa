package curso;

import java.util.Locale;
import java.util.Scanner;

public class Media_ponderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		double mp = 0;

		for (int i = 0; i <= n; i++) {

			double x = in.nextDouble();
			double y = in.nextDouble();
			double z = in.nextDouble();

			mp = ((2.0* x + 3.0 * y + 5.0 * z) / 10.0);

			System.out.printf("%.1f", mp);
		}

		in.close();
	}

}
