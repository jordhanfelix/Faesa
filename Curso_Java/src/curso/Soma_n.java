package curso;

import java.util.Scanner;

public class Soma_n {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.

		int n = in.nextInt();
		
		int aux = 0;

		for (int i = 1; i <= n; i++) {
			
			aux += i;
			

			
			
		}
		System.out.println(aux);

		in.close();

	}

}
