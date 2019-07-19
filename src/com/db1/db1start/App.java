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
		Texto texto = new Texto();
		String txt = "TEste De TExto";
		String txtUpper = texto.toUpper(txt);
		String txtLower = texto.toLower(txt);
		System.out.printf("\nTexto: %s\nMaiusculo: %s\nMinusculo: %s\n", 
				txt, txtUpper, txtLower);

//		Atividade 3
		double x = 1,
				y = 0.2,
				z = 0.1;
		double res1 = Matematica.menor(x, y);
		double res2 = Matematica.menorTriplo(x, y, z);
		System.out.printf("\na = %s, b = %s, c = %s\n", x, y, z);
		System.out.printf("Menor de a e b: %s\n", res1);
		System.out.printf("Menor de a, b e c: %s\n", res2);
		
	}

}
