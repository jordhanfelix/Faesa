package ordenacao;
public class SelecaoDireta {
	public static void main(String[] args) {
	    int vet[] = {23, 4, 33, 45, 19, 12, 28, 40};
	    int menor, x;
	    for(int i = 0; i < vet.length - 1; i++){
	      menor = i;
	      x = vet[i];
	      for(int j = i + 1; j < vet.length; j++){
	        if(vet[j] < x){
	          menor = j;
	          x = vet[j];
	        }
	      }
	      vet[menor] = vet[i];
	      vet[i] = x;
	    }
	    for(int i = 0; i < vet.length; i++){
	      System.out.println(vet[i]);
	    }
	}
}
