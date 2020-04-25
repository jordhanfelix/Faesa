package curso;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
	
	int c = in.nextInt();
	
	double hr = in.nextDouble();
	double vl = in.nextDouble();
	double result = hr*vl;
	
	System.out.println("NUMBER = "+ c);
	System.out.printf("SALARY = U$ %.2f%n", result);
	in.close();
}
}
