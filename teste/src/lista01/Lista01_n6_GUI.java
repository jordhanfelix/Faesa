package lista01;

import javax.swing.JOptionPane;

public class Lista01_n6_GUI {
	public static void main(String[] args) {
		String [] animais = new String[5];
		char opcao;
		String procura;
		int i, inicio=0, fim= animais.length-1, meio;
		boolean achou=false;
		for (i=0; i< animais.length; i++){
			animais[i] = JOptionPane.showInputDialog
					("digite o tipo do animal:");
		}
		do{
			opcao = JOptionPane.showInputDialog
					("1 usar pesquisa sequencial\n"
					+ "2. usar pesquisa binária\n"
					+ "3. sair").charAt(0);
			switch(opcao){
			case '1':
				procura = JOptionPane.showInputDialog
				("digite o tipo de animal");
				i=0;
				while (i< animais.length &&
						!animais[i].equals(procura)){
					i++;
				}
				if (i==animais.length){
					JOptionPane.showMessageDialog
					(null,"animal não encontrado");
				}else{
					JOptionPane.showMessageDialog
					(null,"animal está no vetor");
				}
				break;
			case '2':
				String aux;
				for (i=0;i < animais.length-1; i++){
					for (int j=0; j<animais.length-1-i; j++){
						if (animais[j].compareTo(animais[j+1])>0){
							aux = animais[j];
							animais[j]= animais[j+1];
							animais[j+1]= aux;
						}
					}
				}
				for (i=0; i < animais.length;i++){
					JOptionPane.showMessageDialog
					(null, animais[i]+ " ");
				}
				procura = JOptionPane.showInputDialog
						("digite o tipo de animal");
				while ((inicio <= fim) && (!achou)){
					meio = (inicio + fim) / 2;
					if (procura.equals(animais[meio])){
						achou = true;
					}
					if (procura.compareTo(animais[meio]) < 0){
						fim = meio - 1;
					} else {
						inicio = meio + 1;
					}
				}
				if (!achou){
					JOptionPane.showMessageDialog
					(null,"animal não encontrado");
				}else{
					JOptionPane.showMessageDialog
					(null,"animal está no vetor");
				}
				break;
			case '3':
				JOptionPane.showMessageDialog
				(null,"fim");
				break;
			default:	
				JOptionPane.showMessageDialog
				(null,"opção invalida");
			}
		}while (opcao!='3');
		System.exit(0);
	}
}
