package com.db1.db1start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora(4, 2);
	}
	
	@Test
	public void deveSomarDoisValores() { 
		int soma = calculadora.somar();
		Assert.assertEquals(6, soma);
	}
	
	@Test
	public void deveDiminuirDoisValores() {
		int subtracao = calculadora.subtrair();
		Assert.assertEquals(2, subtracao);
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		int multi = calculadora.mult();
		Assert.assertEquals(8, multi);
	}
	
	@Test
	public void deveDividirDoisValores() {
		int div = calculadora.div();
		Assert.assertEquals(2, div);
	}
	
	@Test
	public void deveMostrarSeN1ehPar() {
		boolean par = calculadora.par();
		Assert.assertEquals(true, par);
	}
	
	@Test
	public void deveMostrarQualNumeroEhMaior() {
		int maior = calculadora.maior();
		Assert.assertEquals(4, maior);
	}
	
	@Test
	public void deveContarNumerosImparesDeN1ate100() {
		int impares = calculadora.calcImpar();
		Assert.assertEquals(48, impares);
	}

}
