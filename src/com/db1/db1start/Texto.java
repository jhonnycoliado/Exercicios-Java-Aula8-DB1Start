package com.db1.db1start;

public class Texto {

	public String toUpper(String texto) {
		return texto.toUpperCase();
	}
	
	public String toLower(String texto) {
		return texto.toLowerCase();
	}
	
	public int countChr(String texto) {
		return texto.length();
	}
	
	public int countLetra(String texto) {
		return texto.replaceAll(" ","").length();
	}
	
	public String removeSpace(String texto) {
		return texto.replaceAll(" ","");
	}
	
	public String nomeUm(String texto) {
		return texto.substring(0, 4);	
	}
	
	public String nomeDois(String texto) {
		return texto.substring(3);
	}
	
	public String nomeTres(String texto) {
		return texto.substring(texto.length()-4);
	}
	
	public String nomeQuatro(String texto) {
		String[] txt = texto.split(" ");
		txt[0] = "ALUNO";
		return String.join(" " , txt);
	}
	
	public String palavraSeparada(String texto) {
		return texto.replaceAll(" ", "\n");
	}
	
	public int countVogal(String texto) {
		int totalVogais = 0;
		char chars[] = texto.toCharArray();
		for (char c: chars) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				totalVogais++;
			}
		}
		return totalVogais;
	}
	
	public StringBuilder textoInvertido(String texto) {
		StringBuilder invertido = new StringBuilder();
		return invertido.append(texto).reverse();
	}
	
	
	
	
	

}
