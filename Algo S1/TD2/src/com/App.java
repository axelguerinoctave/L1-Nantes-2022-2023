package com;

public class App {

	public static void bissextile() {
		/* operateurs logiques */
		boolean b1 = true && true; // et
		boolean b2 = true || true; // ou
		boolean b3 = !true; // non
		
		
		// Objectif : determiner si l'annee est bissextile ou non
		int annee = 2024; // annee a tester
		//premiere methode
		boolean A = annee % 4 == 0; // L'annee est divisible par 4
		boolean B = annee % 100 == 0; // L'annee est divisible par 100
		boolean C = annee % 400 == 0;; // L'annee est divisible par 400
		
		boolean bissextile = (A && (!B)) || C;
		
		if (bissextile) {
			System.out.println("L'année " + annee + " est bissextile");
		}else {
			System.out.println("L'année " + annee + " n'est pas bissextile");
		}
		// deuxieme methode
		if (((annee % 4 == 0) && (!(annee % 100 == 0))) || (annee % 400 == 0)) {
			System.out.println("L'année " + annee + " est bissextile");
		}else {
			System.out.println("L'année " + annee + " n'est pas bissextile");
		}
	}
	
	public static void main(String[] args) {
		bissextile();
	}

}
