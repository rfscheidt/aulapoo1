package br.com.senai;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero 1"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero 2"));
		int n3 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero 3"));
		
		int maior = procurarMaiorValor(n1, n2, n3);
		
		System.out.println(maior);
		
	}

	private static int procurarMaiorValor(int n1, int n2, int n3) {
		int maior = 0;
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		
		return maior;
	}

}
