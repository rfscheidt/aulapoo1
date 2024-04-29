package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor10 {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[20];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero"));
		}
		
		Integer aux = vetor[0];
		vetor[0] = vetor[19];
		vetor[19] = aux;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
