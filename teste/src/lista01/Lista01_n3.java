package lista01;

public class Lista01_n3 {
	public static void main(String[] args) {
		String [] vet = {"Mario","Valdir","Carlos","Jorge",
				"Bia","Ana","Zelia","Manoel","Carla","ana"};
		//ordenação por Seleção Direta
		int menor;
		String x;
		for(int i = 0; i < vet.length-1; i++){
			menor = i;
			x = vet[i];
			for(int j = i + 1; j < vet.length; j++){
				if(vet[j].compareToIgnoreCase(x) < 0){
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
