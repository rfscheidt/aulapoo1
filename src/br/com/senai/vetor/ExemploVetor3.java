package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor3 {

	public static void main(String[] args) {
		int numeroDeAlunos = Integer.valueOf(JOptionPane.showInputDialog("Quanto alunos..."));
		
		String[] vetorDeNomes = new String[numeroDeAlunos];
		
		for (int i = 0; i < vetorDeNomes.length; i++) {
			vetorDeNomes[i] = "nome " + i;
		}
		
		System.out.println("");

	}

}
