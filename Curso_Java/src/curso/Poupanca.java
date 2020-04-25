package curso;

import java.util.Scanner;

public class Poupanca {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int mes = 12;
		double saldo = 3000.00;
		double juros = 0;
		
		
		for (int i = 1; i <=mes; i++) {
			
			juros += ((saldo  * 0.05) / 100);
			
			
			
		}	 
		System.out.printf("Saldo: %.2f%n" , juros + saldo);
		
		
		
		
			
		in.close();
	}
}
