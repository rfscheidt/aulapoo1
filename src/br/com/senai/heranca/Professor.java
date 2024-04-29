package br.com.senai.heranca;

public class Professor extends Pessoa {
	
	private Double salario;
	
	private Double desconto;
	
	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public Double calcularSalario() {
		return salario;
	}
	
}
