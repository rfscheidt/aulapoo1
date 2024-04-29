package br.com.senai.heranca2;

public class Diretor extends Funcionario {

	private Double bonus;

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double calcularSalario() {
		return (super.getSalario() - super.getDesconto());
	}
	
}
