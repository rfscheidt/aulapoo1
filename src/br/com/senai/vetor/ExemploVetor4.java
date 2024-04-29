package br.com.senai.vetor;

import java.util.Random;

public class ExemploVetor4 {
	
	public static void main(String[] args) {
		//Inicialização do Vetor
		String[] vetorDeNomes = new String[50];
		
		//Popular o vetor
		for (int i = 0; i < vetorDeNomes.length; i++) {
			vetorDeNomes[i] = "" + new Random().nextInt(10);
		}
		
		//Escrever os dados do vetor
		for (int i = 0; i < vetorDeNomes.length; i++) {
			if (vetorDeNomes[i].equalsIgnoreCase("9")) {
				System.out.println(i);
			}
		}

	}

}
