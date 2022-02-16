package com.codingdojo.calculadora;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {
	private double operandoUno;
	private double operandoDos;
	private String operacion;
	private double resultado;
	private String operacionString;

	public void realizarOperacion() {
		boolean flag = true;
		if (this.operacion.equals("+")) {
			this.resultado = getOperandoUno() + getOperandoDos();
		} else if (this.operacion.equals("-")) {
			this.resultado = getOperandoUno() - getOperandoDos();
		} else if (this.operacion.equals("*")) {
			this.resultado = getOperandoUno() * getOperandoDos();
		} else if (this.operacion.equals("/")) {
			this.resultado = getOperandoUno() / getOperandoDos();
		} else {
			System.out.println("No tiene asignado un simbolo de operacion valido");
			flag = false;
		}

		if (flag) {
			System.out.println("Se realizo la operacion");
		}
	}

	public void realizarOperacion2(String nuevo) {
		setOperacionString(getOperacionString().concat(nuevo).concat("ñ"));
	}

	public void getResultado2() {
		ArrayList<String> operaciones = new ArrayList<>(Arrays.asList(this.operacionString.split("ñ")));

		for (int i = 0; i < operaciones.size(); i++) {
			if (operaciones.get(i).equals("*") || operaciones.get(i).equals("/")) {
				double result = 0;
				if (operaciones.get(i).equals("*")) {
					result = Double.parseDouble(operaciones.get(i - 1)) * Double.parseDouble(operaciones.get(i + 1));
				} else {
					result = Double.parseDouble(operaciones.get(i - 1)) / Double.parseDouble(operaciones.get(i + 1));
				}
				operaciones.set(i, String.valueOf(result));
				operaciones.remove(i - 1);
				operaciones.remove(i);
			}
		}
		

		for (int i = 0; i < operaciones.size(); i++) {
			if (operaciones.get(i).equals("+") || operaciones.get(i).equals("-")) {
				double result = 0;
				if (operaciones.get(i).equals("+")) {
					result = Double.parseDouble(operaciones.get(i - 1)) + Double.parseDouble(operaciones.get(i + 1));
				} else {
					result = Double.parseDouble(operaciones.get(i - 1)) - Double.parseDouble(operaciones.get(i + 1));
				}
				operaciones.set(i, String.valueOf(result));
				operaciones.remove(i - 1);
				operaciones.remove(i);
			}
		}

		System.out.println(operaciones.get(0));
	}

	public String getOperacionString() {
		return operacionString;
	}

	public void setOperacionString(String operacionString) {
		this.operacionString = operacionString;
	}

	public Calculadora() {
		operacionString = "";
	}

	public double getResultado() {
		System.out.println(resultado);
		return resultado;
	}

	public double getOperandoUno() {
		return operandoUno;
	}

	public void setOperandoUno(double operandoUno) {
		this.operandoUno = operandoUno;
	}

	public double getOperandoDos() {
		return operandoDos;
	}

	public void setOperandoDos(double operandoDos) {
		this.operandoDos = operandoDos;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	};

}
