package lista01;

import java.util.Scanner;

public class Lista01_n1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tam, aux, x, k;
		int [] vet;
		System.out.println("Digite o tamanho do vetor:");
		tam = scan.nextInt();
		vet = new int [tam];
		//letra a
		for (int i=0;i<vet.length;i++){
			System.out.println("digite o "+(i+1)+ "º número:");
			vet[i]=scan.nextInt();
		}
		//letra b
		for (int i=0;i<vet.length-1;i++){
			for (int j=0;j<vet.length-1-i;j++){
				if (vet[j]>vet[j+1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor ordenado.");
		for (int i=0;i<vet.length;i++){
			System.out.print(vet[i]+ " ");
		}
		//letra c
		System.out.println("\ndigite o numero a ser procurado:");
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

	}

}
