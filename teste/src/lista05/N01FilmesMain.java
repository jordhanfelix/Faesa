package lista05;

import javax.swing.JOptionPane;

public class N01FilmesMain {

	public static void main(String[] args) {
		N01FilmesVet locadora = new N01FilmesVet(10);
		char opcao;
		do{
			opcao = JOptionPane.showInputDialog("1. cadastrar filme\n"+
					"2. total de genero\n"+
					"3. remover filme\n"+
					"4. sair").charAt(0);
			switch(opcao){
			case '1':
				cadastrarFilme(locadora);
				break;
			case '2':
				totalizarGenero(locadora);
				break;
			case '3':
				removerFilme(locadora);
				break;
			case '4':
				JOptionPane.showMessageDialog(null, "fim de programa");
				break;
			default:	
				JOptionPane.showMessageDialog(null, "opção inválida");

			}
		}while (opcao!='4');
	}
	static void cadastrarFilme(N01FilmesVet loc){
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("digite o codigo:"));
		String titulo = JOptionPane.showInputDialog("digite o titulo:");
		char genero = JOptionPane.showInputDialog("digite o genero: A-ação,T-terror,D-drama:").charAt(0);
		N01Filmes novo = new N01Filmes(codigo,titulo,genero);
		if (loc.inserirFilme(novo)){
			JOptionPane.showMessageDialog(null, "operação realizada com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "arquivo cheio");
		}
	}
	static void totalizarGenero(N01FilmesVet loc){
		char genero = JOptionPane.showInputDialog("digite o genero: A-ação,T-terror,D-drama:").charAt(0);
		int resposta = loc.totalizarGenero(genero);
		if (resposta==-1){
			JOptionPane.showMessageDialog(null, "arquivo vazio");
		}else{
			JOptionPane.showMessageDialog(null, "tem "+resposta+" filmes do genero.");
		}
	}
	static void removerFilme(N01FilmesVet loc){
		String titulo = JOptionPane.showInputDialog("digite o titulo do filme a ser removido:");
		if (loc.removerFilme(titulo)){
			JOptionPane.showMessageDialog(null, "operação realizada com sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "operação não realizada.");
		}
	}
}
