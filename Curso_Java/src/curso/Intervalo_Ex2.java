package curso;

import java.util.Scanner;

public class Intervalo_Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int en = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {

			int x = in.nextInt();
			if (x >= 10 && x <= 20) {
				en = en + 1;

			} else {
				out = out + 1;

			}
			System.out.println(en + " in");
			System.out.println(out + " out");

		}

		in.close();
	}

}
