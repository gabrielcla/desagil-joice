package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{

	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}

	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.022*Math.pow(10, 23);
		double massa = 4 *peso/avogadro;
		
		double aresta = 2*Math.pow(2, 0.5) * raio /Math.pow(10, 7); 
		double volume = Math.pow(aresta, 3);
		
		return massa/volume;
	}

}
