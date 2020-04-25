package pesquisa;
import java.util.Scanner;
public class PesquisaBinaria {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] vet = {2,6,9,10,11,20,26,30};
		int x, meio=0, inicio=0, fim=vet.length-1;
		boolean achou = false;
		System.out.println("digite o número a ser procurado:");
		x = scan.nextInt();
		while ((inicio <= fim) && (!achou)){
			meio = (inicio + fim) / 2;
			if (x == vet[meio]){
				achou = true;
			}
			if (x < vet[meio]){
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		if (!achou){
			System.out.println("não achou");
		} else {
			System.out.println("achou e está na posição "+meio);
		}
	}
}
