package testeDeLogica;

public class E1 {

	public static void main(String[] args) {
		
		int cod1 = 12, p1 = 1, cod2 = 16 , p2  = 2;
		double v1 = 5.30;
		double v2 = 5.10;
		
		double total = (p2*v2) + v1;
		
		System.out.println("Entrada : \n"
				+ cod1+" "+p1+" "+v1+"\n"
				+cod2+ " "+ p2+ " "+ v2+ "\nValor a pagar: "+ total);

	}

}
