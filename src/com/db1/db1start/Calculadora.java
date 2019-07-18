package com.db1.db1start;

public class Calculadora {
	
	private int n1;
	private int n2;
	private double n3;
	
	public Calculadora(int n1, int n2, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public int somar() {
		return this.n1+this.n2;
	}
	
	public int subtrair() {
		return this.n1-this.n2;
	}
	
	public int mult() {
		return this.n1*this.n2;
	}
	
	public int div() {
		return this.n1 / this.n2;
	}
	
	public boolean par() {
		if ((this.n1 % 2) == 0) {
			return true;
		}
		else return false;
	}
	
	public int maior() {
		if (this.n1 == this.n2) {
			return 0;
		}
		if (this.n1 > this.n2) {
			return this.n1;
		}
		else return this.n2;
	}
	
	public int calcImpar() {
		if (this.n1 >= 100) {
			return 0;
		}
		int totalImpar = 0;
		for (int i = this.n1; i < 100; i++) {
			if ((i % 2) != 0) {
				totalImpar++;
			}
		}
		return totalImpar;
	}
	
	public double menor() {
		if (this.n1 == this.n2) {
			return 0;
		}
		if(this.n1 < this.n2) {
			return this.n1;
		}
		else return this.n2;
	}
	
	public double menorTres() {
		if (this.n1 < this.n2 && this.n1 < this.n3) {
			return this.n1;
		}
		if (this.n2 < this.n1 && this.n2 < this.n3) {
			return this.n2;
		}
		else return this.n3;
	}
	
	public double mediaTres() {
		double total = this.n1+this.n2+this.n3;
		return total/3;
		
	}

}
