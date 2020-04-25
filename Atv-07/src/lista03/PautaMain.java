package lista03;
import java.util.Scanner;
public class PautaMain {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		//instanciar objeto do tipo Pauta
		Pauta aluno = new Pauta();
		char opcao;
		do{
			System.out.println("1.	Cadastrar um aluno\n"+
					"2.	Mostrar todos os dados do aluno\n"+
					"3.	Verificar se o aluno está reprovado por falta\n"+
					"4.	Mostrar a média do aluno\n"+
					"5.	Mostrar situação de aprovação ou reprovação\n"+
					"6.	Finalizar operações");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarAluno(aluno);
				break;
			case '2':
				System.out.println("\ndados do aluno:"+aluno.toString());
				break;
			case '3':
				if (aluno.verificarAprovacao()){
					System.out.println("\naluno reprovado por falta\n");
				}else{
					System.out.println("\naluno aprovado\n");
				}
				break;
			case '4':
				System.out.println("\na média de "+aluno.getNomeAluno()+ " é "
						+aluno.calcularMedia()+"\n");
				break;
			case '5':
				if (aluno.verificarAprovacaoGeral()){
					System.out.println("\naluno aprovado\n");
				}else{
					System.out.println("\naluno reprovado por falta e/ou nota\n");
				}
				break;
			case '6':
				System.out.println("fim de programa.");
				break;
			default:
				System.out.println("opção invalida.");
			}
		}while (opcao!='6');
	}
	static void cadastrarAluno(Pauta aluno){
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
	}
}
