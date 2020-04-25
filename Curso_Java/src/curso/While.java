package curso;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double n = in.nextDouble();
		
		while (n>=0) {
			
			double sr =Math.sqrt(n);
			System.out.printf("Raiz quadrada é: %.3f%n", sr);
			
			System.out.print("Digite um numero: ");
			 n =in.nextDouble();
		}
		
		System.out.println("Fim do programa, este numero é negativo");
		
		
		
		
		in.close();
	}
}
