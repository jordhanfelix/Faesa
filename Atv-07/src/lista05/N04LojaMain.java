package lista05;

import javax.swing.JOptionPane;

public class N04LojaMain {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog
				("digite o tamanho do vetor:"));
		N04LojaVet cadastro = new N04LojaVet(tamanho); 
		char opcao;
		do{
			opcao = JOptionPane.showInputDialog("1. cadastrar produto\n"
							+ "2. mostrar lucro\n"
							+ "3. mostrar produto com estoque"
							+ " abaixo do minimo\n"
							+ "4. sair").charAt(0);
			switch (opcao){
			case '1':
				cadastrarProduto(cadastro);
				break;
			case '2':
				mostrarLucro(cadastro);
				break;
			case '3':
				mostrarEstoqueMinimo(cadastro);
				break;
			case '4':
				JOptionPane.showMessageDialog(null, "fim.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "opção invalida.");
			}
		}while (opcao!='4');
	}
	static void cadastrarProduto(N04LojaVet c){
		int codigo = Integer.parseInt(JOptionPane.showInputDialog
				("digite o codigo do produto:"));
		String descricao = JOptionPane.showInputDialog
				("digite a descricao:");
		double precoCompra = Double.parseDouble(JOptionPane.showInputDialog
				("digite o preco de compra:"));
		double precoVenda = Double.parseDouble(JOptionPane.showInputDialog
				("digite o preco de venda:"));
		int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog
				("digite o estoque:"));
		int estoqueMinimo = Integer.parseInt(JOptionPane.showInputDialog
				("digite o estoque minimo:"));
		N04Loja novo = new N04Loja(codigo,descricao,precoCompra,precoVenda,
				quantidadeEstoque,estoqueMinimo);
		if (c.inserirDados(novo)){
			JOptionPane.showMessageDialog(null, "sucesso.");
		}else{
			JOptionPane.showMessageDialog(null, "sem sucesso.");
		}
	}
	static void mostrarLucro(N04LojaVet c){
		int codigo = Integer.parseInt(JOptionPane.showInputDialog
				("digite o codigo do produto para mosrtar seu lucro:"));
		double resp = c.lucroProduto(codigo);
		if (resp==-1){
			JOptionPane.showMessageDialog(null, "arquivo vazio ou"
					+ " codigo não encontrado.");
		}else{
			JOptionPane.showMessageDialog(null, "o lucro é "+resp);
		}
	}
	static void mostrarEstoqueMinimo(N04LojaVet c){
		String resp = c.mostrarAbaixoEstoque();
		if (resp==null){
			JOptionPane.showMessageDialog(null, "arquivo vazio.");
		}else{
			JOptionPane.showMessageDialog(null, resp);
		}
	}
}
