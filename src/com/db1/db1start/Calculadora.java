package com.db1.db1start;

public class Calculadora {
	
	
	public int somar(int n1, int n2) {
		return n1+n2;
	}
	
	public int subtrair(int n1, int n2) {
		return n1-n2;
	}
	
	public int mult(int n1, int n2) {
		return n1*n2;
	}
	
	public int div(int n1, int n2) {
		return n1 / n2;
	}
	
	public boolean par(int n1) {
		return (n1 % 2) == 0;
	}
	
	public int maior(int n1, int n2) {
		return Math.max(n1, n2);
	}
	
	public int calcImpar(int n1) {
		if (n1 >= 100) {
			return 0;
		}
		int totalImpar = 0;
		for (int i = n1; i < 100; i++) {
			if ((i % 2) != 0) {
				totalImpar++;
			}
		}
		return totalImpar;
	}
	
	public double menor(double n1, double n2) {
		return Math.min(n1, n2);
	}
	
	public double menorTres(double n1, double n2, double n3) {
		double min = Math.min(n1, n2);
		return Math.min(n3, min);
	}
	
	public double mediaTres(double n1, double n2, double n3) {
		double total = n1+n2+n3;
		return total/3;
	}
	
	public double areaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}

}
