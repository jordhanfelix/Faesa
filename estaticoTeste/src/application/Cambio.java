package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Cambio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dolar = in.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double x = in.nextDouble();
		
		double a = CurrencyConverter.converter(dolar, x);
		
		System.out.printf("Amount to be paid in reais = %.2f", a);
		
		
		
		
		
		in.close();
	}

}
