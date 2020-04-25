package classes;

public class Aluno {
	//atributos
	private int matricula;
	private String nome;
	private char sexo;
	private String tel;
	
	//construtor(es)
	public Aluno(){
		this.matricula=0;
		this.nome = "";
		this.sexo = ' ';
		this.tel = "";
	}
	public Aluno(int mat, String n, char s, String t){
		this.matricula = mat;
		this.nome = n;
		this.sexo = s;
		this.tel = t;
	}
	public Aluno(int mat){
		this.matricula = mat;
		this.nome = "";
		this.sexo = 'm';
		this.tel = "";
	}
	//get - método do tipo função para ler um atributo
	public int getMatricula(){
		return this.matricula;
	}
	public String getNome(){
		return this.nome;
	}
	public char getSexo(){
		return this.sexo;
	}
	public String getTel(){
		return this.tel;
	}
	//set - método do tipo procedimento para alterar o valor de um atributo
	public void setMatricula(int mat){
		this.matricula = mat;
	}
	public void setNome(String novo){
		this.nome = novo;
	}
	public void setSexo(char novo){
		this.sexo = novo;
	}
	public void setTel(String novo){
		this.tel = novo;
	}
	//toString - método para mostrar todos os atributos
	public String toString(){
		return this.matricula+ " "+this.nome+ " "+this.sexo+" "+this.tel;
	}
}
