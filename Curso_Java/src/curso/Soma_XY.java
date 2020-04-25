package curso;

import java.util.Locale;
import java.util.Scanner;

public class Soma_XY {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		/*
		 * Faça um programa que receba dois números X e Y, sendo X < Y. Calcule e
		 * mostre: • a soma dos números pares desse intervalo de números, incluindo os
		 * números digitados • a multiplicação dos números ímpares desse intervalo,
		 * incluindo os digitados
		 **/
		double x = in.nextDouble();
		double y = in.nextDouble();
		double soma = 0;
		double mult = 1;

		if (x < y) {
			while (x <= y) {

				if (x % 2 == 0) {

					soma += x;

				}else {
					mult *= x;
				}
				
				x++;
			}
			
			System.out.printf("Soma : %.1f%n", soma);
			System.out.printf("Multiplicação: %.1f%n", mult);
		}else{
			System.out.println("X não é menor que Y.");
		}	
		
		in.close();
	}

}
