package lista01;
import java.util.Scanner;
public class Lista01_n6 {
	public static void main(String[] args) {
		String [] animais = new String[5];
		Scanner scan = new Scanner(System.in);
		char opcao;
		String procura;
		int i, inicio=0, fim= animais.length-1, meio;
		boolean achou=false;
		for (i=0; i< animais.length; i++){
			System.out.println("digite o tipo do animal:");
			animais[i] = scan.next();
		}
		do{
			System.out.println("1 usar pesquisa sequencial\n"
					+ "2. usar pesquisa binária\n"
					+ "3. sair");
			opcao = scan.next().charAt(0);
			switch(opcao){
			case '1':
				System.out.println("digite o tipo de animal");
				procura = scan.next();
				i=0;
				while (i< animais.length &&
						!animais[i].equals(procura)){
					i++;
				}
				if (i==animais.length){
					System.out.println("animal não encontrado");
				}else{
					System.out.println("animal está no vetor");
				}
				break;
			case '2':
				String aux;
				for (i=0;i < animais.length-1; i++){
					for (int j=0; j<animais.length-1-i; j++){
						if (animais[j].compareTo(animais[j+1])>0){
							aux = animais[j];
							animais[j]= animais[j+1];
							animais[j+1]= aux;
						}
					}
				}
				for (i=0; i < animais.length;i++){
					System.out.print(animais[i]+ " ");
				}
				System.out.println();
				System.out.println("digite o tipo de animal");
				procura = scan.next();
				while ((inicio <= fim) && (!achou)){
					meio = (inicio + fim) / 2;
					if (procura.equals(animais[meio])){
						achou = true;
					}
					if (procura.compareTo(animais[meio]) < 0){
						fim = meio - 1;
					} else {
						inicio = meio + 1;
					}
				}
				if (!achou){
					System.out.println("animal não encontrado");
				}else{
					System.out.println("animal está no vetor");
				}
				break;
			case '3':
				System.out.println("fim");
				break;
			default:	
				System.out.println("opção invalida");
			}
		}while (opcao!='3');
		System.exit(0);
	}
}
