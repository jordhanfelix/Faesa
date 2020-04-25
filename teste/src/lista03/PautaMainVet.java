package lista03;
import java.util.Scanner;
public class PautaMainVet {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		//instanciar objeto do tipo PautaVet
		final int tam = 5;  //tamanho do vetor
		PautaVet turma = new PautaVet(tam);
		char opcao;
		do{
			System.out.println("\n1.Cadastrar um aluno\n"+
					"2.Mostrar todos os dados dos alunos\n"+
					"3.Pesquisar um determinado aluno\n"+
					"4.Excluir um aluno\n"+
					"5.Alterar dados de um aluno\n"+
					"6.Finalizar operações\n");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarAluno(turma);
				break;
			case '2':
				System.out.println("\ndados dos alunos:\n"+turma.toString());
				break;
			case '3':
				pesquisarAluno(turma);
				break;
			case '4':
				excluirAluno(turma);
				break;
			case '5':
				alterarAluno(turma);
				break;
			case '6':
				System.out.println("fim de programa.");
				break;
			default:
				System.out.println("opção invalida.");
			}
		}while (opcao!='6');
	}
	static void cadastrarAluno(PautaVet turma){
		Pauta aluno = new Pauta();
		System.out.println("digite a matricula");
		aluno.setMatricula(scan.nextInt());
		System.out.println("digite o nome do aluno");
		aluno.setNomeAluno(scan.next());
		System.out.println("digite o numero de faltas");
		aluno.setNumFalta(scan.nextInt());
		System.out.println("digite a nota1");
		aluno.setNota1(scan.nextDouble());
		System.out.println("digite a nota2");
		aluno.setNota2(scan.nextDouble());
		if (turma.inserirDados(aluno)){
			System.out.println("\ninseriu com sucesso\n");
		}else{
			System.out.println("\narquivo cheio\n");
		}
	}
	static void pesquisarAluno(PautaVet turma){
		System.out.println("digite a matricula a ser procurada:");
		int mat = scan.nextInt();
		int resp = turma.pesquisarDado(mat);
		if (resp==-1 || resp==turma.getQuantVet()){
			System.out.println("\naluno não encontrado.\n");
		}else{
			System.out.println("\n"+turma.getVetor(resp));
		}
	}
	static void excluirAluno(PautaVet turma){
		System.out.println("digite a matricula do aluno que será excluido:");
		int mat = scan.nextInt();
		if (turma.removerDado(mat)){
			System.out.println("\naluno excluido.\n");
		}else{
			System.out.println("\naluno não encontrado\n");
		}
	}
	static void alterarAluno(PautaVet turma){
		System.out.println("digite a matricula do aluno para alterar dados:");
		int mat = scan.nextInt();
		Pauta novo = new Pauta();
		System.out.println("digite a matricula");
		novo.setMatricula(scan.nextInt());
		System.out.println("digite o nome do aluno");
		novo.setNomeAluno(scan.next());
		System.out.println("digite o número de faltas");
		novo.setNumFalta(scan.nextInt());
		System.out.println("digite a nota1");
		novo.setNota1(scan.nextDouble());
		System.out.println("digite a nota2");
		novo.setNota2(scan.nextDouble());
		if (turma.alterarDados(mat, novo)){
			System.out.println("\nalterado com sucesso.\n");
		}else{
			System.out.println("\naluno não encontrado.\n");
		}
	}

}
