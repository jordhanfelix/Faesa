package lista01;

import java.util.Scanner;

public class Lista01_n5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] vetor = new int[200];
		int x, temp, j;
		int meio=0, inicio = 0, fim = vetor.length-1;
		boolean achou = false;
		//preencher vetor com números aleatórios
		for (int i=0;i<vetor.length;i++){
			vetor[i] = (int)(Math.random()*100);
		}
		System.out.println("-----vetor preenchido-----");
		for (int i=0;i<vetor.length;i++){
			System.out.print(vetor[i] +" ");
		}
		//ordenar vetor
		for (int i = 1; i < vetor.length; i++){
			temp = vetor[i];
			j = i-1;
			while ((j >= 0)&&(vetor[j]>temp)){
				vetor [j+1] = vetor[j--];
			}
			vetor[j+1] = temp;
		}
		System.out.println("-------");
		System.out.println("-----vetor ordenado----");
		for (int i=0;i<vetor.length;i++){
			System.out.print(vetor[i] +" ");
		}
		System.out.println("-------");
		//busca binária
		System.out.println("Digite o número a ser procurado:");
		x = scan.nextInt();
		while ((inicio <= fim) && (!achou)){
			meio = (inicio + fim) / 2;
			if (x == vetor[meio]){
				achou = true;
			}
			if (x < vetor[meio]){
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
