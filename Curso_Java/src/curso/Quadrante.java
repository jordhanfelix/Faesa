package curso;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		
		while (x !=0 || y !=0) {
			
			if (x > 0 && y> 0) {
				System.out.println("Primeiro");
				x = in.nextInt();
				y = in.nextInt();
			}else if(x < 0 && y> 0) {
				System.out.println("Segundo");
				x = in.nextInt();
				y = in.nextInt();
				
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
				x = in.nextInt();
				y = in.nextInt();
			}else{
				System.out.println("Quarto");
				
			}
			x = in.nextInt();
			y = in.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		in.close();
	}
}
