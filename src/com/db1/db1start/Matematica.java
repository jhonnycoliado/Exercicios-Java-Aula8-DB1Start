package com.db1.db1start;

public class Matematica {
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static int subtracao(int a, int b) {
		return a-b;
	}
	
	public static double menor(double a, double b) {
		if (a < b) {
			return a;
		}
		else return b;
	}
	
	public static double menorTriplo(double a, double b, double c) {
		if (a < b & a < c) {
			return a;
		}
		else if (b < a & b < c) {
			return b;
		}
		else return c;
	}
}
	


