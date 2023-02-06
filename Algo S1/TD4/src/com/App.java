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
	
	public static int sommeTableau(int[] tableau) {
		int somme = 0;
		for(int i = 0; i < tableau.length; i++) {
			somme = somme + tableau[i];
		}
		return somme;
	}
	
	public static int sommeTableau2(int[] tableau) {
		int somme = 0;
		for(int elem : tableau) {
			somme += elem;
		}
		return somme;
	}
	
	public static void estPair(int[] tableau) {
		boolean pair = true;
		for (int elem : tableau) {
			if (elem % 2 != 0) {
				pair = false; 
			}
		}
		if (pair) {
			System.out.println("Le tableau est pair");
		} else {
			System.out.println("Le tableau n'est pas pair");
		}
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
		System.out.println("La somme du tableau est : " + sommeTableau(tableau));
		estPair(tableau);
		tableau[5] = 3;
		estPair(tableau);
	}

}
