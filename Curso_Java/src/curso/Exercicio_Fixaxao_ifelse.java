package curso;

import java.util.Scanner;

public class Exercicio_Fixaxao_ifelse {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		
		if(a >=b) {
			System.out.println(a);
			
		}else if(b >= c) {
			System.out.println(b);
		}else if(c >=a ) {
			System.out.println(c);
		}else if(c >= b) {
			System.out.println(c);
		}else if(b >= a ) {
			System.out.println(b);
		}else if(a >= c) {
			System.out.println(a);
		}
		
		in.close();
		
	}

}
