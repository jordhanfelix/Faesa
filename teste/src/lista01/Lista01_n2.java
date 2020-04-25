package lista01;
import java.util.Scanner;
public class Lista01_n2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tam, aux, x, k, opcao;
		int [] vet;
		System.out.println("Digite o tamanho do vetor:");
		tam = scan.nextInt();
		vet = new int [tam];
		boolean preenchido = false;
		do{
			System.out.println("Escolha uma opção:\n"+
					"1. preencher dados no vetor\n"+
					"2. ordenar os dados do vetor\n"+
					"3. pesquisar um dado no vetor\n"+
					"4. sair");
			opcao = scan.nextInt();
			switch (opcao){
			case 1:
				for (int i=0;i<vet.length;i++){
					System.out.println("digite o "+(i+1)+ "º número:");
					vet[i]=scan.nextInt();
				}
				preenchido = true;
				break;
			case 2:
				if (preenchido){
					for (int i=0;i<vet.length-1;i++){
						for (int j=0;j<vet.length-1-i;j++){
							if (vet[j]>vet[j+1]){
								aux = vet[j];
								vet[j] = vet[j+1];
								vet[j+1] = aux;
							}
						}
					}
				}else{
					System.out.println("preencha primeiro o vetor");
				}
				break;
			case 3:
				if (preenchido){
					System.out.println("\ndigite o número a ser procurado:");
					x = scan.nextInt();
					k = 0;
					while ((k < vet.length)&&(x != vet[k])){
						k++;
					}
					if (k==vet.length){
						System.out.println("o valor não foi encontrado.");
					}else{
						System.out.println("o valor foi encontrado na"
								+ " posição "+k);
					}
				}else{
					System.out.println("preencha primeiro o vetor");
				}
				break;
			case 4:
				System.out.println("fim de programa.");
				break;
			default :	
				System.out.println("opção invalida. Tente novamente.");
			}
		}while (opcao!=4);
	}
}
