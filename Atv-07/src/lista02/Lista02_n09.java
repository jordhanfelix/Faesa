package lista02;

import java.util.Scanner;

public class Lista02_n09 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner ler = new Scanner(System.in); 
		System.out.println("digite um numero:");
		num1 = ler.nextInt();
		System.out.println("digite outro numero:");
		num2 = ler.nextInt();
		System.out.println(acharMenor(num1, num2));
	}
	static String acharMenor(int n1, int n2){
		if (n1<n2){
			return "o menor numero é "+n1;
		}else{
			if (n1>n2){
				return "o menor numero é "+n2;
			}else{
				return "os números são iguais";
			}
		}
	}
	
	
	
	
	
}
