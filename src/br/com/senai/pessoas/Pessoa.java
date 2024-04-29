package br.com.senai.pessoas;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	

	private String nome; //JOAO
	private int idade;
	
	private List<Endereco> endereco = new ArrayList<Endereco>(); //1, 2, 3
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	public Pessoa(String nome, int idade, List<Endereco> endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}


}
