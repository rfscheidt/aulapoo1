package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor9 {

	public static void main(String[] args) {
		Integer tamanhoDoVetor = Integer.valueOf(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		Integer[] vetor = new Integer[tamanhoDoVetor];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero"));
		}
		
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i]; // soma = soma + vetor[i];
		}
		
		System.out.println(soma);
	}

}
