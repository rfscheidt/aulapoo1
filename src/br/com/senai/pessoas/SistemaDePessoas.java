package br.com.senai.pessoas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SistemaDePessoas {

	static List<Pessoa> lista = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		cadastrar();
		remover();
		atualizar();
		pesquisaAvancada();
	}

	private static void pesquisaAvancada() {
		String rua = JOptionPane.showInputDialog("digite a rua");

		for (Pessoa pessoa : lista) { 
			List<Endereco> enderecos = pessoa.getEndereco();
			for (Endereco endereco : enderecos) {
				if (endereco.getRua().equalsIgnoreCase(rua)) {
					System.out.println(pessoa.toString());
				}
			}
		}
	}

	public static void cadastrar() {
		String nome = JOptionPane.showInputDialog("nome");
		Integer idade = Integer.valueOf(JOptionPane.showInputDialog("idade"));

		List<Endereco> enderecos = new ArrayList<Endereco>();
		do {
			String rua = JOptionPane.showInputDialog("rua");
			String cidade = JOptionPane.showInputDialog("cidade");
			String estado = JOptionPane.showInputDialog("estado");
			
			Endereco endereco = new Endereco(rua, cidade, estado);
			enderecos.add(endereco);
			
			
		} while (Integer.valueOf(JOptionPane.showInputDialog("deseja cadastrar um novo "
				+ "endereco? 1-sim 2-nao")) == 1);
		
		Pessoa pessoa = new Pessoa(nome, idade, enderecos);
		lista.add(pessoa);
	}

	public static void remover() {
		String nome = JOptionPane.showInputDialog("digite o nome da pessoa");

		for (Pessoa pessoa : lista) { 
			if (pessoa.getNome().equalsIgnoreCase(nome)) {
				lista.remove(pessoa); 
				return;
			} 
		}
	}

	public static void atualizar() {
		String nome = JOptionPane.showInputDialog("digite o nome da pessoa");

		for (Pessoa pessoa : lista) { 
			if (pessoa.getNome().equalsIgnoreCase(nome)) {
				pessoa.setNome(JOptionPane.showInputDialog("nome"));
				pessoa.setIdade(Integer.valueOf(JOptionPane.showInputDialog("idade")));
				
				List<Endereco> enderecos = new ArrayList<Endereco>();
				do {
					String rua = JOptionPane.showInputDialog("rua");
					String cidade = JOptionPane.showInputDialog("cidade");
					String estado = JOptionPane.showInputDialog("estado");
					
					Endereco endereco = new Endereco(rua, cidade, estado);
					enderecos.add(endereco);
					
					
				} while (Integer.valueOf(JOptionPane.showInputDialog("deseja cadastrar um novo "
						+ "endereco? 1-sim 2-nao")) == 1);
				
				pessoa.setEndereco(enderecos);
				
				return;
			} 
		}
	}

	public static void listar() {
		for (Pessoa pessoa : lista) { 
			System.out.println(pessoa.toString());
		}
	}

}
