package br.edu.ifrs.canoas.java.entidade;

public class Diretor extends Funcionario {

	public String getNome() {
		return "Diretor " + super.getNome();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario()*0.20+1000;
	}

}
