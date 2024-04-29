package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor11 {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[20];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		
		int contadorDePares = 0;
		String pares = "";
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				contadorDePares++;
				pares = pares + vetor[i] + ", ";
			}
		}
		
		System.out.println(contadorDePares);
		System.out.println(pares);

	}

}
