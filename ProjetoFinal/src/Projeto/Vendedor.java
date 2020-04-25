package Projeto;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Vendedor {
	private String nome;
	private int codigo;
	private char sexo;
	private String setor;
	private double comissao;


	//Construtores
	public Vendedor() {
		this.nome = "";
		this.codigo = 0;
		this.sexo = ' ';
		this.setor = "";
		this.comissao = 0;
	}

	public Vendedor(String nome, int cod, char sexo, String setor, double comissao) {
		this.nome = nome;
		this.codigo = cod;
		this.sexo = sexo;
		this.setor = setor;
		this.comissao = comissao;
	}


	//Get - Set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	//toString
	public String toString() {
		return this.nome + ";" + this.codigo + ";" + this.sexo + ";" + this.setor + ";"	+ this.comissao + ";";
	}


	
}//Vendedor




