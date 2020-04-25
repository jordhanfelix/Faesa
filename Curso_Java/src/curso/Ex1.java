package curso;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int result = a+b;
		System.out.println("SOMA = "+ result);
		
		
		
		in.close();
	}

}
