package com;

public class App {

	public static void afficherTableau(int[] tableau) {
		System.out.print("[");
		for(int i = 0; i < tableau.length - 1; i++) { // affiche le tableau
			System.out.print(tableau[i]);
			System.out.print("; ");
		}
		System.out.print(tableau[tableau.length - 1]);
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int n = 4;
		double x = 5.3;
		boolean b = true;
		String s = "Bonjour !";
		
		int[] tableau = new int[10]; // creation tableau de taille 10
		
		System.out.println(tableau[9]); // Affichage d'un element du tableau
		
		tableau[3] = 4;
		
		for(int i = 0; i <= 9; i++) {
			tableau[i] = 2 * (i + 1);
		}
		
		afficherTableau(tableau);
	}

}
