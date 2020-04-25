package pesquisa;
import java.util.Scanner;
public class PesquisaBinariaOrdenacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] vet = {30,6,20,11,10,9,26,2};
		//ordenação bolha
		int aux; 
		for (int i=0; i<vet.length-1; i++){
			for (int j=0; j<vet.length-1-i; j++){
				if (vet[j]>vet[j+1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		//pesquisa binaria  
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
		for (int i=0; i<vet.length; i++){
		    System.out.println(vet[i]);
		  }
	}

}
