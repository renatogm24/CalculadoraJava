package com.codingdojo.calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setOperandoUno(10.5);
		c.setOperacion("+");
		c.setOperandoDos(5.2);
		c.realizarOperacion();
		c.getResultado();
	}

}
