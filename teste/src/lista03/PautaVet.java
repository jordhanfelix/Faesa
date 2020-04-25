package lista03;

public class PautaVet {
	//atributos
	private Pauta [] vetor;
	private int quantVet;
	
	//construtor
	public PautaVet(int tamanho){
		this.vetor = new Pauta[tamanho];
		this.quantVet = 0;
	}
	//gets e sets
	public Pauta getVetor(int indice){
		return this.vetor[indice];
	}
	public void setVetor(int indice, Pauta novo){
		this.vetor[indice]= novo;
	}
	public int getQuantVet(){
		return this.quantVet;
	}
	public void setQuantVet(int novo){
		this.quantVet = novo;
	}
	//toString
	public String toString(){
		String resp="";
		for (int i=0; i<this.quantVet;i++){
			resp += this.vetor[i].toString()+"\n";
		}
		return resp;
	}
	//inserir
	public boolean inserirDados(Pauta novo){
		if (this.quantVet==this.vetor.length){//verificar se o vetor está cheio 
			return false;
		}else{
			this.vetor[this.quantVet]= novo;
			this.quantVet++;
			return true;
		}
	}
	//pesquisar
	public int pesquisarDado(int matricula){
		if (this.quantVet==0){
			return -1;
		}else{
			//pesquisa sequencial
			int i=0;
			while (i<this.quantVet && this.vetor[i].getMatricula()!=matricula){
				i++;
			}
			if (i==this.quantVet){
				return this.quantVet;
			}else{
				return i;
			}
		}
	}
	//remover
	public boolean removerDado(int matricula){
		if (this.quantVet==0){
			return false;
		}else{
			int respPesquisa = this.pesquisarDado(matricula);
			if (respPesquisa==this.quantVet){
				return false;
			}else{
				this.vetor[respPesquisa]= this.vetor[this.quantVet-1];
				this.quantVet--;
				return true;
			}
		}
	}	
	//alterar
	public boolean alterarDados(int matricula, Pauta novo){
		if (this.quantVet==0){
			return false;
		}else{
			int respPesquisa = this.pesquisarDado(matricula);
			if (respPesquisa==this.quantVet){
				return false;
			}else{
				this.vetor[respPesquisa]= novo;
				return true;
			}
		}
	}	
}
