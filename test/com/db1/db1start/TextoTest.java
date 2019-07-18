package com.db1.db1start;

import org.junit.Test;

import org.junit.Assert;

public class TextoTest {
	
	@Test
	public void deveRetornarTextoMaisculo() {
		Texto texto = new Texto("Sample Text");
		String res = texto.toUpper();
		Assert.assertEquals("SAMPLE TEXT", res);
	}
	
	@Test
	public void deveRetornarTextoMinusculo() {
		Texto texto = new Texto("Sample Text");
		String res = texto.toLower();
		Assert.assertEquals("sample text", res);
	}
	
	@Test
	public void deveContarOnumeroDeCaracteres() {
		Texto texto = new Texto("DB1START");
		int res = texto.countChr();
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void deveContarApenasLetras() {
		Texto texto = new Texto(" DB1START ");
		int res = texto.countLetra();
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void deveRemoverTodosOsEspacos() {
		Texto texto = new Texto(" DB1START ");
		String res = texto.removeSpace();
		Assert.assertEquals("DB1START", res);
	}
	
	@Test
	public void retornaApenasAsQuatroPrimeiraLetras() {
		Texto texto = new Texto("Jhonny da silva coliado");
		String res = texto.nomeUm();
		Assert.assertEquals("Jhon", res);
	}
	
	@Test
	public void retornaONomeAPartirDaTerceiraLetra() {
		Texto texto = new Texto("Jhonny da silva coliado");
		String res = texto.nomeDois();
		Assert.assertEquals("nny da silva coliado", res);
	}
	
	@Test
	public void retornaSomeAsQuatroUltimasLetras() {
		Texto texto = new Texto("Jhonny da silva coliado");
		String res = texto.nomeTres();
		Assert.assertEquals("iado", res);
	}
	
	@Test
	public void substituiOPrimeiroNomePorAlUNO() {
		Texto texto = new Texto("Jhonny da silva coliado");
		String res = texto.nomeQuatro();
		Assert.assertEquals("ALUNO da silva coliado", res);
	}
	
	@Test
	public void retornaAsPalavrasSeparadas() {
		Texto texto = new Texto("banana, maçã, melancia");
		String res = texto.palavraSeparada();
		Assert.assertEquals("banana,\nmaçã,\nmelancia", res);
	}
	
	@Test
	public void retornaONumeroDeVogais() {
		Texto texto = new Texto("Jhonny da");
		int res = texto.countVogal();
		Assert.assertEquals(2, res);
	}
	
	@Test
	public void retornaOTextoInvertido() {
		Texto texto = new Texto("sample text");
		String res = texto.textoInvertido();
		Assert.assertEquals("txet elpmas", res);
	}
	
	
	

}
