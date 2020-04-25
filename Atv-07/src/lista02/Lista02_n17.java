package lista02;
import java.util.Scanner;
public class Lista02_n17 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		final int tam = 5;
		double [] produtoEnlatado = new double[tam]; 
		double [] produtoEnsacolado = new double[tam];
		char opcao;
		do{
			System.out.println("\n\nEscolha uma opção:\n"
					+ "1. cadastrar produtos\n"
					+ "2. mostrar menor preço\n"
					+ "3. mostrar quantidade de produtos"
					+ "com preço maior que 1000\n"
					+ "4. fim");
			opcao = ler.next().charAt(0);
			switch (opcao){
			case '1': 
				System.out.println("cadastrar produtos enlatados\n");
				preencherVetor(produtoEnlatado);
				System.out.println("cadastrar produtos ensacolados\n");
				preencherVetor(produtoEnsacolado);
				break;
			case '2':
				System.out.println("\no menor preço do "
						+ "produto enlatado é "+produtoEnlatado[menorPreco(produtoEnlatado)]);
				System.out.println("\no menor preço do "
						+ "produto ensacolado é "+produtoEnsacolado[menorPreco(produtoEnsacolado)]);
				break;
			case '3':
				System.out.println("\na quantidade de produtos enlatado"
						+ " com preços maior que 1000 é "+
						contarQuantidade(produtoEnlatado));
				System.out.println("\na quantidade de produtos ensacolados"
						+ " com preços maior que 1000 é "+
						contarQuantidade(produtoEnsacolado));
				break;
			case '4':
				System.out.println("fim de programa");
				break;
			default:
				System.out.println("opção inválida");
			}
		}while (opcao!='4');
		System.exit(0);
	}
	static void preencherVetor(double [] v){
		for (int i=0;i< v.length; i++){
			System.out.println("digite o preço do produto:");
			v[i] = ler.nextInt();
		}
	}
	static int menorPreco(double [] v){
		int menor = 0;
		for (int i=0; i< v.length; i++){
			if (v[i] < v[menor]){
				menor = i;
			}
		}
		return menor;
	}
	static int contarQuantidade(double [] v){
		int cont=0;
		for (int i=0; i< v.length; i++){
			if (v[i] > 1000){
				cont++;
			}
		}
		return cont;
	}

}
