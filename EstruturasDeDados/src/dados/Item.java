package dados;

public class Item {
	
	// Atributos: Podem ser adicionados mais se necessario
	private int chave;

	
	// Construtos
	public Item(int chave) {
		super();
		this.chave = chave;
	}

	// GET AND SET
	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

}
