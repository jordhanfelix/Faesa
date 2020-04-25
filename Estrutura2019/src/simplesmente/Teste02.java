package simplesmente;

import java.util.Scanner;

import dados.Item;

public class Teste02 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		lista.inserirNo(new Item(10));
		lista.inserirNo(new Item(15));
		lista.inserirNo(new Item(50));
		lista.inserirNo(new Item(40));
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o valor de k");
		int k = scan.nextInt();
		System.out.println(lista.removerkesimo(k));
		//para verificar se está correto
		System.out.println(lista.toString());
	}
}
