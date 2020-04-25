package curso;

import java.util.Scanner;

public class Estrutura_Condicionais {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// EX1:

		 int a = in.nextInt();
		 if(a >= 0) {
		 System.out.println("NAO NEGATIVO");
		 }else {
		 System.out.println("NEGATIVO");
		}

		// EX2
		int b = in.nextInt();

		 if(b % 2 ==0) {
		 System.out.println("PAR");
		}else {
		 System.out.println("IMPAR");
		 }

		// EX3
		 int c = in.nextInt();
		 int d = in.nextInt();

		 if (c % d == 0 || d % c== 0) {

		System.out.println("São multiplos");
		 }else {
		System.out.println("Não são multiplos");
		 }

		 //EX4

		int e = in.nextInt();
		int f = in.nextInt();

		int result;

		if ( e < f) {
			result = f - e;
		}else {
			result = 24 - e + f;
		}
		System.out.println(" O jogo surou "+ result + "HORA(S)");
		in.close();}
}
