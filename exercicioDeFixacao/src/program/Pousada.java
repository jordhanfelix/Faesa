package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Pousada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Cadastro aux = null;

		int n = in.nextInt();

		Cadastro[] vect = new Cadastro[n];

		for (int i = 0; i < vect.length; i++) {
			in.nextLine();
			System.out.println("Rent #" + (i + 1));
			String name = in.nextLine();
			String email = in.nextLine();
			int quarto = in.nextInt();
			vect[i] = new Cadastro(name, email, quarto);

		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < vect.length; i++) {

			for (int j = 0; j < (vect.length - 1); j++) {

				if (vect[j].getQuarto() > vect[j + 1].getQuarto()) {
					aux = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = aux;
				}

			}

		}
		for (int i = 0; i < vect.length; i++) {

			System.out.println(vect[i].toString());
		}

		in.close();
	}

}
