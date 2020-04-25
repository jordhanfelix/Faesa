package program;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Contra_Cheque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Funcionario func = new Funcionario();

		System.out.printf("Name: ");
		func.name = in.nextLine();
		System.out.printf("Gross salary: ");
		func.grosSalary = in.nextDouble();
		System.out.printf("Tax: ");
		func.tax = in.nextDouble();

		System.out.println();
		System.out.println("Employee: " + func.toString());
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double update = in.nextDouble();
		System.out.println();
		func.increaseSalary(update);

		System.out.println("Update data: "+ func);	
		
		in.close();
	}

}
