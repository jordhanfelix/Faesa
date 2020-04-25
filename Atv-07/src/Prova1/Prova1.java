package Prova1;

import java.util.Scanner;

public class Prova1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		final int TAM = 3;
		String nomes[] = new String[TAM];
		double venda[] = new double[TAM];
		char opcao;
		do {
			System.out.println("\nEscolha uma opção:\n"
					+ "1. Cadastrar funcionário e sua venda mensal.\n"
					+ "2. Calcular pontuação e mostrar salário final.\n"
					+ "3. Sair.");
			opcao = scan.next().charAt(0);
			switch (opcao) {
			case '1':
				cadastrarDados(nomes, venda);
				break;
			case '2':
				System.out.println("Rendimento mensal:\n" + calcularPontuacao(nomes, venda));
				break;
			case '3':
				System.out.println("Listagem dos funcionários:\n" + ordenarNomes(nomes) +
						"\nPrograma finalizado.");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (opcao != '3');
	}

	static void cadastrarDados(String n[], double v[]) {
		for (int i = 0; i < n.length; i++) {
			System.out.print("\nDigite o nome do funcionário: ");
			n[i] = scan.next();
			System.out.print("Digite sua venda mensal: ");
			v[i] = scan.nextDouble();
		}
	}

	static String calcularPontuacao(String n[], double v[]) {
		String resp = "";
		double pontos=0;
		for (int i = 0; i < n.length; i++) {
			pontos = v[i]/100;
			resp += "Funcionário: " + n[i] + " tem a pontuação: " + pontos +
					" e seu salário: R$" + (pontos* 50) + "\n";
		}
		return resp;
	}

	static String ordenarNomes(String n[]) {
		int menor;
		String x, nome = " ";

		for (int i = 0; i < n.length - 1; i++) {
			menor = i;
			x = n[i];
			for (int j = i + 1; j < n.length; j++) {
				if (n[j].compareToIgnoreCase(x) < 0) {
					menor = j;
					x = n[j];
				}
			}
			n[menor] = n[i];
			n[i] = x;
		}
		for (int i = 0; i < n.length; i++) {
			nome += n[i] + " \n";
		}
		return nome;
	}
}
