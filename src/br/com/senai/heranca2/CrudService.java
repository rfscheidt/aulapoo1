package br.com.senai.heranca2;

public class CrudService {

	public void cadastrar(Funcionario fun) {
		if (fun instanceof FuncionarioRegular) {
			FuncionarioRegular funRegular = (FuncionarioRegular) fun;
			System.out.println((funRegular.calcularSalario() + funRegular.getBonus()) + 100);
		} else if (fun instanceof Gerente) {
			Gerente funGerente = (Gerente) fun;
			System.out.println((funGerente.calcularSalario() + funGerente.getBonus())  + 200);
		} else {
			Diretor funDiretor = (Diretor) fun;
			System.out.println((funDiretor.calcularSalario() + funDiretor.getBonus()) + 400);
		}
		
		/*
		try {
			System.out.println((fun.calcularSalario() + ((FuncionarioRegular)fun).getBonus()));
		} catch (Exception e) {
			System.out.println("deu problema");
		}
		
		try {
			System.out.println((fun.calcularSalario() + ((Gerente)fun).getBonus()));
		} catch (Exception e) {
			System.out.println("deu problema");
		}
		
		try {
			System.out.println((fun.calcularSalario() + ((Diretor)fun).getBonus()));
		} catch (Exception e) {
			System.out.println("deu problema");
		}
		*/
	}

}
