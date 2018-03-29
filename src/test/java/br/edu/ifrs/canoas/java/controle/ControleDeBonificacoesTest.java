package br.edu.ifrs.canoas.java.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.java.entidade.Diretor;
import br.edu.ifrs.canoas.java.entidade.Funcionario;
import br.edu.ifrs.canoas.java.entidade.Gerente;

public class ControleDeBonificacoesTest {

	ControleDeBonificacoes controle;
	
	@Before
	public void setup(){
		controle = new ControleDeBonificacoes();
	}
	
	
	@Test
	public void testPolimorfismo() {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setSalario(1000.0);
		
		Funcionario funcionario2 = new Gerente();
		funcionario2.setSalario(1000.0);

		Funcionario funcionario3 = new Diretor();
		funcionario3.setSalario(1000.0);

		controle.registra(funcionario1);
		assertEquals("A bonificacao deve ser  10% do salario do Funcionario", 100, controle.getTotalDeBonificacoes(), 0);

		controle.registra(funcionario2);
		assertEquals("A bonificacao deve ser valor anterior + 10% do salario do Gerente + 1000 (100+100+1000)", 1200, controle.getTotalDeBonificacoes(), 0);

		controle.registra(funcionario3);
		assertEquals("A bonificacao deve ser valor anterior + 20% do salario do Diretor + 1000 (100+100+1000+200+1000)", 2400, controle.getTotalDeBonificacoes(), 0);
		
	}
	/*
	@Test
	public void testPolimorfismoComSecretaria() {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setSalario(1000.0);
		
		Funcionario funcionario2 = new Secretaria();
		funcionario2.setSalario(1000.0);

		controle.registra(funcionario1);
		assertEquals("A bonificacao deve ser  10% do salario do Funcionario", 100, controle.getTotalDeBonificacoes(), 0);

		controle.registra(funcionario2);
		assertEquals("A bonificacao deve ser valor anterior + 12% do salario", 220, controle.getTotalDeBonificacoes(), 0);
		
	}
	*/

}
