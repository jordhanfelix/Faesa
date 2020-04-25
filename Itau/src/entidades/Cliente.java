package entidades;

public class Cliente {

	private String nome;
	private int nConta;
	private double saldo;

	// Construtores

	public Cliente(String nome, int contaN) {
		this.nome = nome;
		this.nConta = contaN;
	}

	public Cliente(String nome, int nConta, double inicialDeposit) {

		this.nome = nome;
		this.nConta = nConta;
		deposito(inicialDeposit);
	}

	// get and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	// METODOS

	public void deposito(double conta) {
		saldo += conta;
	}

	public void saque(double saldo) {
		this.saldo -= saldo + 5.00;

	}

	public String toString() {
		return "Account " + nConta 
						  + ", Holder: " 
				          + nome 
				          + ", Ballance: $ " 
				          + String.format("%.2f", saldo);
	}
}
