package com.db1.db1start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveSomarDoisValores() { 
		int soma = calculadora.somar(4, 2);
		Assert.assertEquals(6, soma);
	}
	
	@Test
	public void deveDiminuirDoisValores() {
		int subtracao = calculadora.subtrair(4, 2);
		Assert.assertEquals(2, subtracao);
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		int multi = calculadora.mult(4, 2);
		Assert.assertEquals(8, multi);
	}
	
	@Test
	public void deveDividirDoisValores() {
		int div = calculadora.div(4, 2);
		Assert.assertEquals(2, div);
	}
	
	@Test
	public void deveMostrarSeONumeroEPar() {
		boolean par = calculadora.par(4);
		Assert.assertEquals(true, par);
	}
	
	@Test
	public void deveMostrarQualNumeroEhMaior() {
		int maior = calculadora.maior(4, 2);
		Assert.assertEquals(4, maior);
	}
	
	@Test
	public void deveContarNumerosImparesDeNate100() {
		int impares = calculadora.calcImpar(4);
		Assert.assertEquals(48, impares);
	}
	
	
	@Test
	public void deveRetornarOMenorNumeroEntreN1eN2() {
		double res = calculadora.menor(4, 2);
		Assert.assertEquals(2.0, res, 0.01);
	}
	
	@Test
	public void deveRetornarOMenorNumeroEntreN1eN2eN3() {
		double res = calculadora.menorTres(4, 2, 0.5);
		Assert.assertEquals(0.5, res, 0.01);
	}
	
	@Test
	public void deveRetornarAMediaDeTresNumeros() {
		double res = calculadora.mediaTres(4, 2, 0.5);
		Assert.assertEquals(2.16, res, 0.01);
	}
	
	@Test
	public void retornarAAreaTriangulo() {
//		Assumindo que N1 = Altura e N2 = Base.
		double res = calculadora.areaTriangulo(4, 2);
		Assert.assertEquals(4.0, res, 0.01);
	}
	
	
	

}
