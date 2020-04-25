package Projeto;

import java.io.*;

public class Controlador {	
	//Constante contendo a pasta do banco de dados
	private static File pasta = new File(System.getProperty("user.dir") + "\\DB");
	private static File arq = new File(pasta + "\\DB.txt");


	public static boolean toString(Vendedor vend) {

		try {
			StringBuffer memoria = new StringBuffer();

			return false;
		}
		catch (Exception e) {
			System.out.println(e.toString());
			return true;
		}

	}















	//Excluir
	public static boolean Excluir(String nome) {
		int inicio, fim;

		try {
			BufferedReader leitura = new BufferedReader(new FileReader(arq));
			BufferedWriter escrita = new BufferedWriter(new FileWriter(arq, true));
			StringBuffer memoria = new StringBuffer();

			//Continua lendo o arquivo enquanto tiver linhas
			while(leitura.ready()) {
				memoria.append(leitura.readLine() + "\r\n");
			}


			inicio = memoria.indexOf(nome);
			if (inicio != -1) {
				//Encontro o caractere de fim de linha
				fim = memoria.indexOf("\r", inicio);

				//Remove o registro especificado
				memoria.delete(inicio, fim + 1);

				//Salva o arquivo sem o registro q foi removido
				Controlador.Gravar(memoria);
			}

			return false;
		}

		catch (Exception e) {
			System.out.println(e.toString());
			return true;
		}
	}



	//Inserção um vendedor no banco
	public static boolean Insere(Vendedor vendedor) {
		try {
			BufferedWriter escrita = new BufferedWriter(new FileWriter(arq, true));		
			escrita.write(vendedor.toString());
			escrita.newLine();

			escrita.flush();	//Remove da memória
			escrita.close();	//Fecha o streaming de dados

			return true;
		}
		catch (Exception e) {
			return false;
		}

	}//Insere



	//Altera
	public static boolean Altera(String nome, int coluna, String Texto) {
		int inicio, primeiro, ultimo;
		String vetor[] = new String[5];
		Vendedor vend;


		try {
			BufferedReader leitura = new BufferedReader(new FileReader(arq));
			BufferedWriter escrita = new BufferedWriter(new FileWriter(arq, true));
			StringBuffer memoria = new StringBuffer();

			String nomev, setor;
			int cod;
			char sexo;
			double comissao;


			//Continua lendo o arquivo enquanto tiver linhas
			while(leitura.ready()) {
				memoria.append(leitura.readLine() + "\r\n");
			}


			inicio = memoria.indexOf(nome);
			if (inicio != -1) {
				ultimo = memoria.indexOf(";", inicio);
				nomev = memoria.substring(inicio, ultimo);

				if(coluna == 1) {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					cod = Integer.parseInt(Texto);
				}
				else {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					cod = Integer.parseInt(memoria.substring(primeiro, ultimo));
				}

				if(coluna == 2) {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					sexo = Texto.charAt(0);
				}
				else {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					sexo = memoria.substring(primeiro, ultimo).charAt(0);
				}

				if(coluna == 3) {
					primeiro = ultimo + 1;
					ultimo = memoria.indexOf(";", primeiro);
					setor = Texto;
				}
				else {
					primeiro = ultimo + 1;
					ultimo = memoria.indexOf(";", primeiro);
					setor = memoria.substring(primeiro, ultimo);
				}

				if(coluna == 4) {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					comissao = Double.parseDouble(Texto);
				}
				else {
					primeiro = ultimo+1;
					ultimo = memoria.indexOf(";", primeiro);
					comissao = Double.parseDouble(memoria.substring(primeiro, ultimo));
				}


				vend = new Vendedor(nome, cod, sexo, setor,	comissao);

				memoria.replace(inicio, ultimo + 1,
						vend.getNome() + ";" +
						vend.getCodigo() + ";" +
						vend.getSexo() + ";" +
						vend.getSetor() + ";" +
						vend.getComissao() + ";");


				Controlador.Gravar(memoria);
			}

			//Returna falso se tudo ocorrer corretamente
			return false;
		}

		catch (Exception e) {
			//Caso ocorra algum erro, será retornado o valor true
			System.out.println(e.toString());
			return true;

		}

	}//Altera


	//Verifica se o banco existe e caso não exista, cria
	public boolean Status() {

		try {
			//Verifica se a pasta existe
			if (!pasta.exists()) {
				pasta.mkdirs();
			}

			//Verifrica se o banco de dados existe
			if (!arq.exists()) {
				BufferedWriter escrita = new BufferedWriter(new FileWriter(arq, false));
				escrita.flush();
				escrita.close();
			}

			return false;
		}
		catch (Exception e) {
			return true;
		}

	} //Status



	//Grava novamente todos os dados do banco
	public static void Gravar(StringBuffer memoria) throws IOException {
		BufferedWriter escrita = new BufferedWriter(new FileWriter(arq, false));
		escrita.write(memoria.toString());
		escrita.flush();
		escrita.close();
	}//Gravar


}//Controlador
