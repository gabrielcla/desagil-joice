package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraCFCTest {
	
	private Calculadora calculadora;
	
	@Test
	public void testCobre() {
		calculadora = new CalculadoraCFC();
		assertEquals(8.89, calculadora.calcula(63.55, 0.128), 0.05);
	}

	@Test
	public void testOuro() {
		calculadora = new CalculadoraCFC();
		assertEquals(19.36, calculadora.calcula(196.97, 0.144), 0.05);
	}
	
	@Test
	public void testPrata() {
		calculadora = new CalculadoraCFC();
		assertEquals(10.60, calculadora.calcula(107.87, 0.144), 0.05);
	}
	
}
