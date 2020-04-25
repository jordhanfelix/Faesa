package curso;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite a senha: ");
		int n = in.nextInt();

		while (n != 2002) {

			System.out.println("Senha invalida.");
			n = in.nextInt();

		}

		System.out.println("Acesso permitido.");

		in.close();
	}

}
