package com;

public class App {
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static int factorielle2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorielle2(n - 1);
		}
	}
	
	public static int factorielle(int n) {
		int fact = 1;
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		return fact; // On retourne n!	
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(10));
		
	}
}
