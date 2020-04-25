package exercicio3;

public class AlunoVet {

	private Aluno[] vetor;
	private int quantVet;

	public AlunoVet(int tamanho) {
		super();
		this.vetor = new Aluno[tamanho];
		this.quantVet = 0;
	}

	public Aluno getVetor(int indice) {
		return this.vetor[indice];
	}

	public void setVetor(Aluno novo, int indice) {
		this.vetor[indice] = novo;

	}

	public int getQuantVet() {
		return quantVet;
	}

	public void setQuantVet(int quantVet) {
		this.quantVet = quantVet;
	}

	public String toString() {
		String resp = "";

		for (int i = 0; i < this.quantVet; i++) {
			resp += (1 + i) + " . " + this.vetor[i].toString();
		}
		return resp;
	} // fim do toString

	// Metodos

	public boolean InserirDados(Aluno novo) {
		if (this.quantVet == this.vetor.length) {
			return false;
		} else {

			this.vetor[this.quantVet] = novo;
			this.quantVet++;
			return true;

		}
	}// Fim do inserir

	public int pesquisarAluno(int Matricula) {

		for (int i = 0; i < this.quantVet; i++) {

			if (this.vetor[i].getMatricula() == Matricula) {
				return i;

			}

		}
		return this.quantVet;
	}// fim do metodo pesquisar

	// remover

	public boolean removerDados(int Matricula) {

		if (this.quantVet == 0) {
			return false;
		} else {

			int i = 0;

			while (i < this.quantVet && this.vetor[i].getMatricula() != Matricula) {
				i++;

			}
			if (i == this.quantVet) {
				return false;
			} else {
				this.vetor[i] = this.vetor[this.quantVet - 1];
				this.quantVet--;
				return true;
			}

		}

	}// fim do remover

}
