package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraCCCTest {

	private Calculadora calculadora;

	@Test
	public void testNiobio() {
		calculadora = new CalculadoraCCC();
		assertEquals(8.57, calculadora.calcula(92.91, 0.143), 0.05);
	}
	
	@Test
	public void testTungstenio() {
		calculadora = new CalculadoraCCC();
		assertEquals(19.28, calculadora.calcula(183.84, 0.137), 0.05);
	}
	
	@Test
	public void testLitio() {
		calculadora = new CalculadoraCCC();
		assertEquals(0.53, calculadora.calcula(6.94, 0.152), 0.05);
	}
}
