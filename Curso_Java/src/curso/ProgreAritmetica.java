package curso;

public class ProgreAritmetica {

	public static void main(String[] args) {
		/**
		 * Progressão Aritmética (P.A) é uma sequência numérica em que cada termo, a
		 * partir do segundo, é igual a soma do termo anterior com uma constante. A
		 * sequência (1, 4, 7, 10, 13, 16) é uma P.A. Crie um algoritmo capaz de gerar
		 * um progressão aritmética de 1 até 100 com contante 6.
		 */

		int pa = 6;
		int resultado =1 ;
	
		while (resultado <=100) {
		
			System.out.println(resultado + ", ");
			
			resultado += pa;
		}

	}

}
