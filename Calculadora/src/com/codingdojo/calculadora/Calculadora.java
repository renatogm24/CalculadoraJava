package com.codingdojo.calculadora;

public class Calculadora {
	private double operandoUno;
	private double operandoDos;
	private String operacion;
	private double resultado;
	
	public void realizarOperacion() {
		boolean flag = true;
		if(this.operacion.equals("+")) {
			this.resultado = getOperandoUno() + getOperandoDos();
		}else if(this.operacion.equals("-")) {
			this.resultado = getOperandoUno() - getOperandoDos();
		}else if(this.operacion.equals("*")) {
			this.resultado = getOperandoUno() * getOperandoDos();
		}else if(this.operacion.equals("/")) {
			this.resultado = getOperandoUno() / getOperandoDos();
		}else {
			System.out.println("No tiene asignado un simbolo de operacion valido");
			flag = false;
		}
		
		if (flag) {
			System.out.println("Se realizo la operacion");
		}
	}
	
	public Calculadora() {}
	
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
