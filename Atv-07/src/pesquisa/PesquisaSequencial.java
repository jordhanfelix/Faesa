package pesquisa;
import java.util.Scanner;
public class PesquisaSequencial {
	public static void main(String[] args) {
		int [] vet = {23, 4, 33, 45, 19, 12, 28, 40};
		   Scanner insere = new Scanner(System.in);
		 System.out.print("digite um número");
		 int x  = insere.nextInt();   
		  int i = 0;
		 while((i < vet.length) && (x != vet[i])){
		 	  i++;
		 }       
		 if (i == vet.length){
		   System.out.println("não achou");
		 }else{
		   System.out.println("achou e está na posição " +i);
		 }
	}
}
