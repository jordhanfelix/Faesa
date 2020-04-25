package lista05;

public class N04LojaVet {
	private N04Loja [] vetor;
	private int quantVet;

	public N04LojaVet(int tam){
		this.vetor = new N04Loja[tam];
		this.quantVet = 0;
	}

	public N04Loja getVetor(int indice){
		return this.vetor[indice];
	}
	public void setVetor(int indice, N04Loja novo){
		this.vetor[indice]=novo;
	}
	public int getQuantVet() {
		return quantVet;
	}
	public void setQuantVet(int quantVet) {
		this.quantVet = quantVet;
	}

	public boolean eVazia(){
		return this.quantVet==0;
	}
	public boolean eCheia(){
		return this.quantVet==this.vetor.length;
	}
	//letra a
	public boolean inserirDados(N04Loja novo){
		if (this.eCheia()){
			return false;
		}else{
			this.vetor[this.quantVet]=novo;
			this.quantVet++;
			return true;
		}
	}
	//letra b
	public double lucroProduto(int codigo){
		if (this.eVazia()){
			return -1;
		}else{
			int posicao = 0;
			while (posicao<this.quantVet && 
					this.vetor[posicao].getCodigo()!= codigo){
				posicao++;
			}
			if (posicao==this.quantVet){
				return -1;
			}else{
				return this.vetor[posicao].getPrecoVenda()-
						this.vetor[posicao].getPrecoCompra();
			}
		}
	}
	//letra  c
	public String mostrarAbaixoEstoque(){
		if (this.eVazia()){
			return null;
		}else{
			String resp="";
			for (int i=0;i<this.quantVet;i++){
				if (this.vetor[i].getQuantidadeEstoque()<
						this.vetor[i].getEstoqueMinimo()){
					resp += this.vetor[i].toString()+"\n";
				}
			}
			return resp;
		}
	}
}
