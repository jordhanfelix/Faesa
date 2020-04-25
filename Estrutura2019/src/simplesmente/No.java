package simplesmente;

import dados.*;

public class No {
	private Item info;
	private No prox;
	
	public No(Item novo){
		this.info = novo;
		this.prox = null;   //linha opcional
	}
	public Item getInfo() {
		return this.info;
	}
	public void setInfo(Item novo) {
		this.info = novo;
	}
	public No getProx() {
		return this.prox;
	}
	public void setProx(No novo) {
		this.prox = novo;
	}
}
