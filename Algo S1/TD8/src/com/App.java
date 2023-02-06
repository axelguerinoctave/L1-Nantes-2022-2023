package com;

import java.util.Scanner;

public class App {

	/*
	 * Mesure du taux d'alcolémie
	 * V : Volume des boissons
	 * t : taux des boissons
	 * m : masse de l'individu
	 * d_ethanol : densité de l'éthanol
	 * coeff_diffusion : coefficient de diffusion, dépend du sexe
	 * sexe ("H" ou "F")
	 */
	
	static double V;
	static double t;
	static double m;
	static double d_ethanol = 0.8;
	static String sexe;
	static double coeff_diffusion;
	
	public static int newInt(String message) {
		Scanner clavier = new Scanner(System.in);
		System.out.print(message);
		int result = clavier.nextInt();
		return result;
	}
	
	public static double newDouble(String message) {
		Scanner clavier = new Scanner(System.in);
		System.out.print(message);
		double result = clavier.nextDouble();
		return result;
	}
	
	public static String newString(String message) {
		Scanner clavier = new Scanner(System.in);
		System.out.print(message);
		String result = clavier.next();
		return result;
	}
	
	public static void main(String[] args) {
		setParameters();
		printParameters();
		System.out.println("Taux = " + getTaux() + "g/L");
	}
	
	public static double getTaux() {
		return (V * t * d_ethanol) / (m * coeff_diffusion);
	}
	
	public static void setParameters() {
		V = newDouble("V = ");
		t = newDouble("t = ");
		m = newDouble("m = ");
		sexe = newString("sexe = ");
		if(sexe.equals("H")) {
			coeff_diffusion = 0.7;
		}else {
			coeff_diffusion = 0.6;
		}
	}
	
	public static void printParameters() {
		System.out.println("V = " + V);
		System.out.println("t = " + t);
		System.out.println("m = " + m);
		System.out.println("sexe = " + sexe);
	}

}
