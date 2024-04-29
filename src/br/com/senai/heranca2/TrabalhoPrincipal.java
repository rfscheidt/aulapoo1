package br.com.senai.heranca2;

public class TrabalhoPrincipal {
	
	public static void main(String args[]) {
		CrudService crud = new CrudService();
		
		FuncionarioRegular fr = new FuncionarioRegular();
		fr.setNome("Marcus");
		fr.setSalario(1000.0);
		fr.setIdade(22);
		fr.setBonus(200.0);
		fr.setDesconto(30.0);
		crud.cadastrar(fr);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Renato");
		gerente.setSalario(2000.0);
		gerente.setIdade(23);
		gerente.setBonus(500.0);
		gerente.setDesconto(50.0);
		crud.cadastrar(gerente);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Joao");
		diretor.setSalario(5000.0);
		diretor.setIdade(30);
		diretor.setBonus(1000.0);
		diretor.setDesconto(80.0);
		crud.cadastrar(diretor);
	}

}
