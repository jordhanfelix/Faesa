package exercicio3;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double nota1 , nota2;
	
	
	public Aluno(int matricula, String nome, double nota1, double nota2) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public Aluno() {
		super();
		this.matricula = 0;
		this.nome = "";
		this.nota1 = 0;
		this.nota2 = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome + "Matricula: " + matricula +  ", Nota 1: " + nota1 + ", Nota 2: " + nota2 ;
	}
	
	
	
	

}
