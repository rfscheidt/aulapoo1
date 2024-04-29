package br.com.senai.vetor;

import javax.swing.JOptionPane;

public class ExemploVetor {

	public static void main(String[] args) {
		Vetor vetorDeNomes = new Vetor();
		
		vetorDeNomes.getVetorDeNomes()[0] = JOptionPane.showInputDialog("nome");
		vetorDeNomes.getVetorDeNomes()[1] = "João";
		vetorDeNomes.getVetorDeNomes()[2] = "Fátima";
		vetorDeNomes.getVetorDeNomes()[3] = "Francisco";
		vetorDeNomes.getVetorDeNomes()[4] = "Fernanda";
		
		System.out.println(vetorDeNomes.getVetorDeNomes());
	}

}
