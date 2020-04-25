package simplesmente;

import dados.Item;

public class Teste13 {

	public static void main(String[] args) {
		ListaSimples lista = new ListaSimples();
		ListaSimples novaLista = new ListaSimples();
		lista.inserirNo(new Item(10));
		lista.inserirNo(new Item(15));
		lista.inserirNo(new Item(50));
		lista.inserirNo(new Item(40));
		System.out.println(lista.toString());
		if (lista.separarLista(novaLista, 40)){
			System.out.println("separou com sucesso");
			System.out.println("primeira lista\n"+lista.toString());
			System.out.println("----------------------");
			System.out.println("segunda lista\n"+novaLista.toString());
		}else{
			System.out.println("lista vazia ou valor não encontrado ou valor no ultimo nó");
		}
	}
}
