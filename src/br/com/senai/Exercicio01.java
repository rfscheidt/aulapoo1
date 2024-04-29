package br.com.senai;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		int n = Integer.valueOf(JOptionPane.showInputDialog("Digite quantos alunos tem na sala"));
		
		for (int i = 0; i < n; i++) {
			double n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 1"));
			double n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite a nota 2"));
			
			double media = calcularMediaDeDoisNumero(n1, n2);
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
			apresentarResultado(media, nome);
		}
	}
	
	private static double calcularMediaDeDoisNumero(double n1, double n2) {
		return (n1 + n2) / 2;
	}
	
	private static void apresentarResultado(double media, String name) {
		if (media >= 6) {
			System.out.println("O aluno " + name + " foi aprovado com média " + media);
		} else {
			System.out.println("O aluno " + name + " foi reprovado com média " + media);
		}
	}

}
