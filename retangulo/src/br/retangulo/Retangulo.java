package br.retangulo;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		double calc = largura * altura;

		return calc;

	}

	public double perimetro() {
		double calc = ((2 * altura) + (2 * largura));
		return calc;
	}
	public double diagonal() {
	 double calc = (altura * altura) +  (largura * largura);
	 return Math.sqrt(calc);
	}
}
