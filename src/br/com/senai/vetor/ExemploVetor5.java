package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor5 {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o num"));
			System.out.println(vetor[i]);
		}
		
		int numeroNegativos = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				numeroNegativos++;
			}
		}
		
		System.out.println("A quantidade de numeros negativos é: " + numeroNegativos);
	}

}
