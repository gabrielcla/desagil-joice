package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {

	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.022*Math.pow(10, 23);
		double massa = 2 *peso/avogadro;
		
		double aresta = 4*raio/Math.pow(10, 7) /Math.pow(3, 0.5); 
		double volume = Math.pow(aresta, 3);
		
		return massa/volume;
	}

}