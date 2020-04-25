package metodos;
import java.util.Scanner;
public class CalacularIdade {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		int anoNasc, anoAtual;
		System.out.println("digite o ano atual:");
		anoAtual = ler.nextInt();
		System.out.println("digite o ano de nascimento:");
		anoNasc = ler.nextInt();
		System.out.println("a idade é "+
		calcularIdade(anoAtual, anoNasc));
	}
	static int calcularIdade(int a, int n){
		int idade;
		idade = a-n;
		return idade;
	}
}
