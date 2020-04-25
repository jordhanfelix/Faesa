package entities;

public class Aluno {

	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;

	public double result() {

		return nota1 + nota2 + nota3;
	}

	public double missingP() {

		if (result() < 60) {
			
			return 60 -result();
		}else {
			return 0.0;
		}

	}

	

}
