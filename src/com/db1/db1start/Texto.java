package com.db1.db1start;

public class Texto {
	private String texto;
	
	public Texto(String texto) {
		this.texto = texto;
	}
	
	public String toUpper( ) {
		return this.texto.toUpperCase();
	}
	
	public String toLower() {
		return this.texto.toLowerCase();
	}
	
	public int countChr() {
		return this.texto.length();
	}
	
	public int countLetra() {
		return this.texto.replaceAll(" ","").length();
	}
	
	public String removeSpace() {
		return this.texto.replaceAll(" ","");
	}
	
	public String nomeUm() {
		String nome = "";
		for (int i = 0; i != 4; i++) {
			nome = nome + this.texto.charAt(i);			
		}
		return nome;
		
	}
	
	public String nomeDois() {
		String nome = "";
		for (int i = 3; i < this.texto.length(); i++) {
			nome = nome + this.texto.charAt(i);			
		}
		return nome;
	}
	
	public String nomeTres() {
		String nome = "";
		for (int i = this.texto.length()-4; i < this.texto.length(); i++) {
			nome = nome + this.texto.charAt(i);			
		}
		return nome;
	}
	
	public String nomeQuatro() {
		String nome = "";
		int espaco = this.texto.indexOf(" ");
		for (int i = espaco+1; i < this.texto.length(); i++) {
			nome = nome + this.texto.charAt(i);
		}
		nome = "ALUNO "+nome;
		return nome;
	}
	
	public String palavraSeparada() {
		return this.texto.replaceAll(" ", "\n");
	}
	
	public int countVogal() {
		int totalVogais = 0;
		char chars[] = this.texto.toCharArray();
		for (char c: chars) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				totalVogais++;
			}
		}
		return totalVogais;
	}
	
	public String textoInvertido() {
		String texto = "";
		for(int i = this.texto.length()-1; i >= 0; i--) {
			texto = texto + this.texto.charAt(i);
		}
		return texto;
	}
	
	
	
	
	

}
