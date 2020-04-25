package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double raio = in.nextDouble();
		
		double area = 3.14159 * (raio* raio);
		
		System.out.printf("A=%.4f%n", area);

		in.close();

	}

}
