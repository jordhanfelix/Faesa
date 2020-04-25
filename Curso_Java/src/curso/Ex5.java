package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int p1 = in.nextInt();
		int qt1 = in.nextInt();
		double v1 = in.nextDouble();
		
		int p2 = in.nextInt();
		int qt2 = in.nextInt();
		double v2 = in.nextDouble();
		
		double valor = ((qt1 * v1) + qt2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		
		in.close();
		
		
		
	}

}
