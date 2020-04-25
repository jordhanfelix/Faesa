package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Fixaxao2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = in.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int x = in.nextInt();
		System.out.println("Enter product price: ");
		double price = in.nextDouble();
		
		
		
		
		
		System.out.println("Enter your last name, age and height (same line");
		String name2 = in.next();
		int idade = in.nextInt();
		double height= in.nextDouble();
		
		System.out.println(name);
		System.out.println(x);
		System.out.println(price);
		System.out.println(name2);
		System.out.println(idade);
		System.out.println(height);
		
		
		
		
		
		
		
		in.close();
	}
}
