package br.com.senai;

import br.com.entidades.Produto;

public class Funcionario {
	
	private String nome;
	
	private double salario;
	
	private Produto e1;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Produto getE1() {
		return e1;
	}

	public void setE1(Produto e1) {
		this.e1 = e1;
	}
	
}
