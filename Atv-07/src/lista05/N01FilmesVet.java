package lista05;

public class N01FilmesVet {
	//atributos
	//o vetor serve para armazenar os objetos do tipo N01Filmes 
	private N01Filmes [] vetor;
	private int quantVet;
	
	//construtor = inicia os atributos
	//o tamanho do vetor será passado via parâmetro
	public N01FilmesVet(int tam){
		this.vetor = new N01Filmes[tam];
		this.quantVet = 0;
	}
	public int getQuantVet() {
		return quantVet;
	}
	public void setQuantVet(int quantVet) {
		this.quantVet = quantVet;
	}
	public N01Filmes getVetor(int indice){
		return this.vetor[indice];
	}
	public void setVetor(int indice, N01Filmes novo){
		this.vetor[indice]=novo;
	}
	//letra a
	public boolean inserirFilme(N01Filmes novo){
		if (this.quantVet==this.vetor.length){  //verifica se o vetor está cheio
			return false;
		}else{
			this.vetor[this.quantVet]=novo;
			this.quantVet++;
			return true;
		}
	}	
	//letra b
	public int totalizarGenero(char g){
		if (this.quantVet==0){   //verifica se o vetor está vazio
			return -1;
		}else{
			int cont=0;
			for(int i=0; i<this.quantVet;i++){
				if (this.vetor[i].getGenero()==g){
					cont++;
				}
			}
			return cont;
		}
	}
	//letra c
	public boolean removerFilme(String t){
		if (this.quantVet==0){    //verifica se o vetor está vazio
			return false;
		}else{
			int i=0;
			while (i<this.quantVet &&
					!this.vetor[i].getTitulo().equals(t)){
				i++;
			}
			if (i==this.quantVet){
				return false;
			}else{
				this.vetor[i]=this.vetor[this.quantVet-1];
				this.quantVet--;
				return true;
			}
		}
	}
}
