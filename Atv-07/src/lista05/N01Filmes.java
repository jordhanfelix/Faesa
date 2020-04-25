package lista05;

public class N01Filmes {
	//tributos
	private int codigo;
	private String titulo;
	private char genero;

	//construtor
	public N01Filmes(int codigo, String titulo, char genero) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
	}
	//métodos de acessar e alterar atributos
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	//método para mostrar o conteúdos de todos os atributos
	public String toString() {
		return "N01Filmes [codigo=" + codigo + ", titulo=" + titulo
				+ ", genero=" + genero + "]";
	}
}
