package lista02;

import java.util.Scanner;

public class Lista02_n11 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int [] vetor = new int[5];
		int pos;
		preencherVetor(vetor);
		pos = procurarMaior(vetor);
		System.out.println("o maior valor é "+vetor[pos]
				+ " e sua posição é "+pos);
	}
	static void preencherVetor(int [] v){
		for (int i=0;i< v.length; i++){
			System.out.println("digite um numero:");
			v[i] = ler.nextInt();
		}
	}
	static int procurarMaior(int [] v){
		int maior = 0;
		for (int i=0; i< v.length; i++){
			if (v[i]> v[maior]){
				maior = i;
			}
		}
		return maior;
	}
}
