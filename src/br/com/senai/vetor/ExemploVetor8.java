package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor8 {

	public static void main(String[] args) {
		
		Integer[] vetor = new Integer[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= Integer.valueOf(JOptionPane.showInputDialog("digite o numero"));
		}
		
		Integer m = Integer.valueOf(JOptionPane.showInputDialog("qual indexvc quer jogar na tela?"));
		
		System.out.println(vetor[m]);
		
	}

}
