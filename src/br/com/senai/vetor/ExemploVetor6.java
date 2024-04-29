package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor6 {
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		int[] vetorNegativos = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o num"));
			System.out.println(vetor[i]);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				vetorNegativos[i]=vetor[i];
			}
		}
		
		for (int i = 0; i < vetorNegativos.length; i++) {
			if (vetorNegativos[i] != 0)
				System.out.println(vetorNegativos[i]);
		}
		
	}

}
