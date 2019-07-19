package com.db1.db1start;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class TextoTest {
	
	private Texto texto;
	
	@Before
	public void setUp() {
		texto = new Texto();
	}
	
	@Test
	public void deveRetornarTextoMaisculo() {
		String res = texto.toUpper("Sample Text");
		Assert.assertEquals("SAMPLE TEXT", res);
	}
	
	@Test
	public void deveRetornarTextoMinusculo() {
		String res = texto.toLower("Sample Text");
		Assert.assertEquals("sample text", res);
	}
	
	@Test
	public void deveContarOnumeroDeCaracteres() {
		int res = texto.countChr("DB1START");
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void deveContarApenasLetras() {
		int res = texto.countLetra(" DB1START ");
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void deveRemoverTodosOsEspacos() {
		String res = texto.removeSpace(" DB1START ");
		Assert.assertEquals("DB1START", res);
	}
	
	@Test
	public void retornaApenasAsQuatroPrimeiraLetras() {
		String res = texto.nomeUm("Jhonny da silva coliado");
		Assert.assertEquals("Jhon", res);
	}
	
	@Test
	public void retornaONomeAPartirDaTerceiraLetra() {
		String res = texto.nomeDois("Jhonny da silva coliado");
		Assert.assertEquals("nny da silva coliado", res);
	}
	
	@Test
	public void retornaSomenteAsQuatroUltimasLetras() {
		String res = texto.nomeTres("Jhonny da silva coliado");
		Assert.assertEquals("iado", res);
	}
	
	@Test
	public void substituiOPrimeiroNomePorAlUNO() {
		String res = texto.nomeQuatro("Jhonny da silva coliado");
		Assert.assertEquals("ALUNO da silva coliado", res);
	}
	
	@Test
	public void retornaAsPalavrasSeparadas() {
		String res = texto.palavraSeparada("banana, maçã, melancia");
		Assert.assertEquals("banana,\nmaçã,\nmelancia", res);
	}
	
	@Test
	public void retornaONumeroDeVogais() {
		int res = texto.countVogal("Jhonny Coliado");
		Assert.assertEquals(5, res);
	}
	
	@Test
	public void retornaOTextoInvertido() {
		StringBuilder res = texto.textoInvertido("sample text");
		Assert.assertEquals("txet elpmas", res.toString());
	}
	
}
