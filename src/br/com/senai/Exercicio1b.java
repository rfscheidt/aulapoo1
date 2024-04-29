package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio1b {

	public static void main(String[] args) {
		String opcao = "sim";
		do {
			double n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 1"));
			double n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 2"));
			
			System.out.println(calcularMediaDeDoisNumero(n1, n2));
			
			opcao = JOptionPane.showInputDialog("Deseja continuar com a media de mais alunos?");
			if (opcao.equalsIgnoreCase("nao"))
				opcao = "nao";
		} while (opcao.equalsIgnoreCase("sim"));
	}
	
	private static double calcularMediaDeDoisNumero(double n1, double n2) {
		return (n1 + n2) / 2;
	}

}
