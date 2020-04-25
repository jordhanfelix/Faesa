package curso;

import java.util.Scanner;

public class Fatoral1 {
	public static void main(String[] args) {

		/*
		 * Na matemática, o fatorial de um número natural n, representado por n!, é o
		 * produto de todos os inteiros positivos menores ou iguais a n. A sequencia (4!
		 * = 4*3*2*1) é uma fatoração do número 4. Crie um algoritmo que receba um
		 * inteiro n e calcule o resultado da fatoração de n.
		 */
		Scanner in = new Scanner(System.in);
		int fat = 1;
		int x = in.nextInt();

		if (x >= 0) {
			System.out.print(x + "! = ");

			for (int i = x; i > 0; i--) {

				fat *= i;
				System.out.print(i);

				if (i == 1) {
					System.out.print("=");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(fat);

			in.close();
		}

	}
}
