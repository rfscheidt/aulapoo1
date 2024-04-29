package br.com.senai;

public class Aula06 {

	public static void main(String[] args) {
		calcularMedia("Rafael", 8, 10);
		calcularMedia("Joao", 3, 3);
		calcularMedia("Renato", 8, 8);
		calcularMedia("Djony", 6, 3);
	}
	
	public static void calcularMedia(String name, double n1, double n2) {
		double media= calcularMediaDeDoisNumero(n1, n2);
		apresentarResultado(media, name);
	}

	private static void apresentarResultado(double media, String name) {
		if (media >= 6) {
			System.out.println("O aluno " + name + " foi aprovado com média " + media);
		} else {
			System.out.println("O aluno " + name + " foi reprovado com média " + media);
		}
	}

	private static double calcularMediaDeDoisNumero(double n1, double n2) {
		return (n1 + n2) / 2;
	}
	
}