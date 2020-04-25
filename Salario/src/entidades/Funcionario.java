package entidades;

public class Funcionario {
	public String name;
	public double grosSalary;
	public double tax;

	public double netSalary() {
		double calc = grosSalary - tax;
		return calc;
	}

	public void increaseSalary(double porcentage) {

		grosSalary += ((porcentage / 100) * grosSalary);
		
		
	}
	
	public String toString() {
		return  name+ ", $ " + String.format("%.2f",netSalary());
	}

}
