package lista02;

import java.util.Scanner;

public class Lista02_n10 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int [] vetor = new int [10];
		preencherVetor(vetor);
		System.out.println("a soma é "+somarVetor(vetor));
	}
	static void preencherVetor(int [] v){
		for (int i=0;i< v.length; i++){
			System.out.println("digite um numero:");
			v[i] = ler.nextInt();
		}
	}
	static int somarVetor(int [] v){
		int soma=0;
		for (int i=0;i< v.length; i++){
			soma+= v[i];
		}
		return soma;
	}
	
	
	
	
}
