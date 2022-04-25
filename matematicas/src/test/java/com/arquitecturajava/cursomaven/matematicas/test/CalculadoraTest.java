package com.arquitecturajava.cursomaven.matematicas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arquitecturajava.cursomaven.matematicas.Calculadora;

public class CalculadoraTest {

	@Test
	public void test() {
			
		assertEquals(4.0, Calculadora.sumar(2, 2),0.0);
	}

}
