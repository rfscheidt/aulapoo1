package br.com.senai.heranca;

public class Principal {

	public static void main(String[] args) {
		ServicoCrud crud = new ServicoCrud();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Joao");
		aluno.setMatricula("12345");
		
		Professor prof = new Professor();
		prof.setNome("Rafael");
		prof.setSalario(10000.0);
		
		crud.cadastrar(aluno);
		crud.cadastrar(prof);
	}

}
