package curso;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a, b, c, d, result;

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		result  = (a*b - c*d);
		System.out.println("DIFERENCA = "+result);
		in.close();
		
	}
}
