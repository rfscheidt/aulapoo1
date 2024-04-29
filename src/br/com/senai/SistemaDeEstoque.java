package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.entidades.Produto;

public class SistemaDeEstoque {

	static List<Produto> listaDeProdutos = new ArrayList<Produto>();

	public static void main(String[] args) {
		chamarMenu();
	}

	private static void chamarMenu() {
		int opcao = 0;
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog("1 cadastrar, 2 remover, 3 consultar, 4 atualizar, 5 listar, 6 sair"));
			if (opcao == 1) {
				cadastrar();
			} else if (opcao == 2) { 
				remover();
			} else if (opcao == 3) { 
				consultar();
			} else if (opcao == 4) { 
				atualizar();
			} else if (opcao == 5) { 
				listar();
			}
			else {
				System.out.println("Digite uma opcao valida");
			}
		} while (opcao != 6);

		System.out.println("bye!!!");
	}

	public static void cadastrar() {
		Produto produto = new Produto();
		produto.setCodprod(Integer.valueOf(JOptionPane.showInputDialog("Digite o cod do produto 1")));
		produto.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 1"));
		produto.setDescprod(JOptionPane.showInputDialog("Digite a desc do produto 1"));

		listaDeProdutos.add(produto);
	}

	public static void remover() {
		Integer cod = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que vc deseja remover"));

		//removendo produtos pelo objeto
		for (Produto produto : listaDeProdutos) { 
			if (produto.getCodprod() == cod) {
				listaDeProdutos.remove(produto); 
			} 
		}

		//removendo produtos pelo index
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			Produto codigo = listaDeProdutos.get(i);
			if (codigo.getCodprod() == cod) {
				listaDeProdutos.remove(i);
			}
		}
	}

	public static void consultar() {
		Integer cod = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que vc deseja consultar"));

		for (Produto produto : listaDeProdutos) {
			if (produto.getCodprod() == cod) {
				System.out.println(produto.toString());
			}
		}
	}

	public static void atualizar() {
		Integer cod = Integer.valueOf(JOptionPane.showInputDialog("Digite o codigo que vc deseja atualizar"));

		for (Produto produto : listaDeProdutos) {
			if (produto.getCodprod() == cod) {
				produto.setNomeprod(JOptionPane.showInputDialog("Digite o nome do produto 1"));
				produto.setDescprod(JOptionPane.showInputDialog("Digite a desc do produto 1"));
			}
		}
	}

	public static void listar() {
		for (Produto produto : listaDeProdutos) {
			System.out.println(produto.toString());
		}
	}


}
