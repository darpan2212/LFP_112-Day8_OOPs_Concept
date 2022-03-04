package com.arithmatic;

public class Arithmatic {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(double a, double b) {
		return (int) (a + b);
	}

	public static void main(String[] args) {
		Arithmatic math = new Arithmatic();
		
		System.out.println(math.add(4, 5));
	}
}