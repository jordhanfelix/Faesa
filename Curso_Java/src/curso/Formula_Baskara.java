package curso;

public class Formula_Baskara {
public static void main(String[] args) {
	
	double a=1.0;
	double b=-3.0;
	double c=-4.0;
	double result;
	
	result = (-b+ Math.sqrt(b*b-4*a*c))/(2*a);
	
	System.out.println(result);
}
	
	
	
}
