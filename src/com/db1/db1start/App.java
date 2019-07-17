package com.db1.db1start;

public class App {
	public static void main(String[] args) {
//		Atividade 1
		int a = 10,
			b = 30;
		int soma = Matematica.soma(a, b);
		int subtracao = Matematica.subtracao(a, b);
		System.out.printf("Equacoes com %s e %s:\nSoma: %s\nSubtracao: %s\n",
				a, b, soma, subtracao);

//		Atividade 2
		String txt = "TEste De TExto";
		String txtUpper = Texto.toUpper(txt);
		String txtLower = Texto.toLower(txt);
		System.out.printf("Texto: %s\nMaiusculo: %s\nMinusculo: %s\n", 
				txt, txtUpper, txtLower);

//		Atividade 3
		double x = 1,
				y = 3,
				z = 0.5;
		double res1 = Matematica.menor(x, y);
		double res2 = Matematica.menorTriplo(x, y, z);
		System.out.printf("a = %s, b = %s, c = %s\n", x, y, z);
		System.out.printf("Menor de a e b: %s\n", res1);
		System.out.printf("Menor de a, b e c: %s\n", res2);
		
	}

}
