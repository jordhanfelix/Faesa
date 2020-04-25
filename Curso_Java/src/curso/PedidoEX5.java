package curso;

import java.util.Locale;
import java.util.Scanner;

public class PedidoEX5 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
	
	int x = in.nextInt();
	int qtd = in.nextInt();
	double valor;
	double a= 4.00;
	double b = 4.50;
	double c = 5.00; 
	double d = 2.00;
	double e = 1.50;
	
	if(x== 1) {
		valor = qtd*a;
		System.out.printf("Total: R$ %.2f%n", valor);
	}else if(x == 2) {
		valor = qtd * b;
		System.out.printf("Total: R$ %.2f%n", valor);
	}else if(x == 3) {
		valor = qtd * c;
		System.out.printf("Total: R$ %.2f%n", valor);
	}else if(x == 4) {
		valor = qtd * d;
		System.out.printf("Total: R$ %.2f%n", valor);
	}else if(x == 5) {
		valor = qtd * e;
		System.out.printf("Total: R$ %.2f%n", valor);
	}
	
	
	
	in.close();
}
}
