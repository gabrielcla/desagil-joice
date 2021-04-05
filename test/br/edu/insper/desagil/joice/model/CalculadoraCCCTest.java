package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.Calculadora;
import br.edu.insper.desagil.joice.model.CalculadoraCCC;

public class CalculadoraCCCTest {

	private Calculadora calculadora;

	@Test
	public void testNiobio() {
		calculadora = new CalculadoraCCC("Niobio");
		assertEquals(8.57, calculadora.calcula(92.91, 0.143), 0.05);
	}
	
	@Test
	public void testTungstenio() {
		calculadora = new CalculadoraCCC("Tungstenio");
		assertEquals(19.28, calculadora.calcula(183.84, 0.137), 0.05);
	}
	
	@Test
	public void testLitio() {
		calculadora = new CalculadoraCCC("Litio");
		assertEquals(0.53, calculadora.calcula(6.94, 0.152), 0.05);
	}
}
