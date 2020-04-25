package curso;

import java.util.Scanner;

public class Posto_Combustivel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cod = in.nextInt();
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		while(cod != 4) {
			if(cod == 1) {
				alcool = alcool +1;
				
			}else if(cod == 2 ) {
				gasolina = gasolina +1;
				
			}else if(cod == 3) {
				diesel = diesel +1;
			}
			cod = in.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		
		in.close();
	}

}
