package com.arquitecturajava.cursomaven.financiera.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arquitecturajava.cursomaven.financiera.CalculadoraFinanciera;

public class CalculadoraFinancieraTest {

	@Test
	public void test() {

		assertEquals(10.0, CalculadoraFinanciera.sumarImportes(5,3,2),0);
		
	}

}
