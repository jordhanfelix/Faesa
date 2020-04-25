package curso;

import java.util.Scanner;

public class For_ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			if(i % 2 !=0) {
				System.out.println(i);
			}
			
		}
	in.close();

	}
}
