package br.com.senai;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		System.out.println(verificaNumero(numero));
	}
	
	public static int verificaNumero(int numero) {
		if (numero >= 0) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
