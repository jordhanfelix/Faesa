package exercicio3;
import java.util.*;

import javax.management.relation.InvalidRelationServiceException;
public class Pauta {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int matricula;
		String nome;
		double not1, not2;
		
		AlunoVet vetor = new AlunoVet(5);
		
		
		int opcao = 0;
		
		do {
		System.out.println("1- Cadastrar \n"+"2- Pesquisar aluno por media\n"+
		"3- Remover Aluno\n"+ "4- Mostrar Todos\n"+ "5- sair");
		System.out.print("DIGITE:>> " );
		opcao = input.nextInt();
		
		switch (opcao) {
		case  1:
			Cadastrar(vetor);
			break;
		case 2: 
			

		default:
			break;
		}
		
		
		}while(opcao !=0);
		
	}

	public static void Cadastrar(AlunoVet C) {
		int matricula;
		String nome;
		double nota1, nota2;
		
		System.out.println("Digite a matricula : ");
		matricula = input.nextInt();
		
		System.out.println("Digite o nome: ");
		nome = input.next();
		
		System.out.println("Digite a 1° nota: ");
		nota1 = input.nextDouble();
		
		System.out.println("Digite a 2º nota : ");
		nota2 = input.nextDouble();
		
		Aluno aluno = new Aluno(matricula, nome, nota1, nota2);
		
		if(C.InserirDados(aluno)) {
			System.out.println("Cadastro realizado com sucesso");
			
		}else {
			System.out.println("Arquivo cheio");
		}
	}
}
