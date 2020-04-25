package Projeto;

import java.io.*;

public class Metodos {
	//Verifico se um vetor contem um valor
	static public int Contains(String vetor[], String texto) {
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == texto) return i;
		}
		
		return -1;
	}
}
