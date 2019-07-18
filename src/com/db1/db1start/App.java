package com.db1.db1start;

public class App {
	public static void main(String[] args) {
//		Calculadora calculadora = new Calculadora(4, 50);
//		System.out.println(calculadora.subtrair());
		
		Calculadora calculadora = new Calculadora(4, 2, 0.5);
		double res = calculadora.mediaTres();
		System.out.println(res);
//		if(res == 2.0) {
		System.out.print((res == 2.0));
//		}
		
//		calculadora.
//		Atividade 1
//		int a = 10,
//			b = 30;
//		int soma = Matematica.soma(a, b);
//		int subtracao = Matematica.subtracao(a, b);
//		System.out.printf("Equacoes com %s e %s:\nSoma: %s\nSubtracao: %s\n",
//				a, b, soma, subtracao);
//
////		Atividade 2
//		String txt = "TEste De TExto";
//		String txtUpper = Texto.toUpper(txt);
//		String txtLower = Texto.toLower(txt);
//		System.out.printf("\nTexto: %s\nMaiusculo: %s\nMinusculo: %s\n", 
//				txt, txtUpper, txtLower);
//
////		Atividade 3
//		double x = 1,
//				y = 0.2,
//				z = 0.1;
//		double res1 = Matematica.menor(x, y);
//		double res2 = Matematica.menorTriplo(x, y, z);
//		System.out.printf("\na = %s, b = %s, c = %s\n", x, y, z);
//		System.out.printf("Menor de a e b: %s\n", res1);
//		System.out.printf("Menor de a, b e c: %s\n", res2);
		
	}

}
