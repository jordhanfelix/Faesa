package simplesmente;

import dados.Item;

public class Teste01 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		lista.inserirNo(new Item(10));
		lista.inserirNo(new Item(15));
		lista.inserirNo(new Item(50));
		lista.inserirNo(new Item(40));
		System.out.println(lista.toString());
	}
}
