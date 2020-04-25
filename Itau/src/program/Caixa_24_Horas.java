package program;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;

public class Caixa_24_Horas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Cliente cliente;

		System.out.print("Enter account number: ");
		int conta = in.nextInt();

		System.out.print("Enter account holder: ");
		in.nextLine();
		String nome = in.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = in.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = in.nextDouble();
			cliente = new Cliente(nome, conta, deposit);
			System.out.println();

		} else {
			cliente = new Cliente(nome, conta);

		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.print(cliente);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double deposit = in.nextDouble();
		System.out.println("Update account data: ");
		cliente.deposito(deposit);
		System.out.print(cliente);
		System.out.println();

		System.out.print("Enter a witdraw value: ");
		double saque = in.nextDouble();
		System.out.println("Update account data: ");
		cliente.saque(saque);
		System.out.println(cliente);

		in.close();
	}

}
