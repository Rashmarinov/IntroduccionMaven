package com.arquitecturajava.cursomaven.matematicas;

public class Calculadora {
	
	public static double sumar (double a, double b) {
		
		return a + b;
	}
	
	public static double restar (double a, double b) {
		
		return a - b;
	}
	
	public static double sumarValores (double  ...valores)  {
		
		double total = 0;
		for(double valor :valores) {
			
			total += valor;
			
		}
		return total;
	}
	
	
}
