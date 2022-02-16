package com.codingdojo.calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.setOperandoUno(10.5);
		c.setOperacion("+");
		c.setOperandoDos(5.2);
		c.realizarOperacion();
		c.getResultado();
		
		Calculadora c2 = new Calculadora();
		c2.realizarOperacion2("10.5");
		c2.realizarOperacion2("+");
		c2.realizarOperacion2("5.2");
		c2.realizarOperacion2("*");
		c2.realizarOperacion2("10");
		c2.getResultado2();
	}

}
