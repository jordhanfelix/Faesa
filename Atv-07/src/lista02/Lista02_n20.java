package lista02;
import java.util.Scanner;
public class Lista02_n20 {
	static Scanner ler = new Scanner (System.in);	
	
	public static void main(String[] args) {
		final int tam = 5;
		int [] codigo = new int [tam];
		String [] nome = new String [tam];
		double [] valor = new double [tam];
		char opcao;
		do{
			System.out.println("1. Incluir todos os dados" +
					"dos vendedores\n"+
			"2. Alterar o valor de uma venda de um"+
			        " determinado vendedor\n" +
			"3. Consultar o nome do vendedor com maior"+
			        " valor de venda no mês\n" +
			"4. Mostrar dados\n" +
			"5. Sair");
			opcao = ler.next().charAt(0);
			switch (opcao){
			case '1':
				preencherDados(codigo,nome,valor);
				break;
			case '2':
				if (alterarDados(nome,valor)){
					System.out.println("operação realizada com sucesso.");
				}else{
					System.out.println("operação não realizada.\n"
							+ " o nome do vendedor não foi encontrado.");
				}
				break;
			case '3':
				System.out.println("o vendedor com maior venda é "+
							procurarMaior(nome,valor));
				break;
			case '4':
				System.out.println(mostrarDados(codigo,
						nome, valor));
				break;
			
			case '5':
				System.out.println("fim de programa");
				break;
			default:
				System.out.println("opção invalida. Tente novamente.");
			}
			
		}while (opcao!='5');
	}
	static String mostrarDados(int [] c, String [] n, double [] v){
		String resp="";
		for (int i=0; i< c.length; i++){
			resp += c[i] + " "+ n[i]+ " "+v[i]+"\n";
		}
		return resp;
	}
	
	
	
	static String procurarMaior(String [] n, double [] v){
		int maior = 0;
		for (int i=1; i< n.length; i++){
			if (v[i]>v[maior]){
				maior = i;
			}
		}
		return n[maior];
	}
	static boolean alterarDados(String [] n, double [] v){
		String nomeProc;
		double novoValor;
		int i = 0;
		System.out.println("entre com o nome do vendedor:");
		nomeProc = ler.next();
		while (i< n.length && !nomeProc.equalsIgnoreCase(n[i])){
			i++;
		}
		if (i==n.length){
			return false;
		}else{
			System.out.println("entre com o novo valor:");
			novoValor = ler.nextDouble();
			v[i] = novoValor;
			return true;
		}
	}
	static void preencherDados(int [] c, String []n,
			double [] v){
		for (int i=0; i < c.length; i++){
			System.out.println("entre com o código:");
			c[i] = ler.nextInt();
			System.out.println("entre com o nome:");
			n[i] = ler.next();
			System.out.println("entre com o valor:");
			v[i] = ler.nextDouble();
		}
	}
}
