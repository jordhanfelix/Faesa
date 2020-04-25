package lista03;

public class Pauta {
	//atributos
	private int matricula;
	private String nomeAluno;
	private int numFalta;
	private double nota1;
	private double nota2;
	//construtor
	public Pauta (int m, String n, int nF, double n1, double n2){
		this.matricula = m;
		this.nomeAluno = n;
		this.numFalta = nF;
		this.nota1 = n1;
		this.nota2 = n2;
	}
	public Pauta (){
		this.matricula = 0;
		this.nomeAluno = "";
		this.numFalta = 0;
		this.nota1 = 0;
		this.nota2 = 0;
	}
	//gets e sets
	public int getMatricula(){
		return this.matricula;
	}
	public String getNomeAluno(){
		return this.nomeAluno;
	}
	public int getNumFalta(){
		return this.numFalta;
	}
	public double getNota1(){
		return this.nota1;
	}
	public double getNota2(){
		return this.nota2;
	}
	public void setMatricula(int novo){
		this.matricula = novo;
	}
	public void setNomeAluno(String novo){
		this.nomeAluno = novo;
	}
	public void setNumFalta(int novo){
		this.numFalta = novo;
	}
	public void setNota1(double novo){
		this.nota1 = novo;
	}
	public void setNota2(double novo){
		this.nota2 = novo;
	}
	//toString
	public String toString(){
		return "\nmatricula:"+this.matricula+
				"\nnome:"+this.nomeAluno+
				"\nnumero de faltas: "+this.numFalta+
				"\nnota 1: "+this.nota1+
				"\nnota 2: "+this.nota2;
	}
	public boolean verificarAprovacao(){
		if (this.numFalta > 25){
			return true; //reprovado
		}else{
			return false;//aprovado
		}
	}		
	public double calcularMedia(){
		return (this.nota1+this.nota2)/2;
	}
	public boolean verificarAprovacaoGeral(){
		if (this.calcularMedia()>=7 && this.numFalta <= 25){
			return true; //aprovado
		}else{
			return false; //reprovado
		}
	}		
}
