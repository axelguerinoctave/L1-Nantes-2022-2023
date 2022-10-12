package com;

public class App {

	public static void parcours1(Noeud arbre) {
		if(arbre.isEmpty()) {
			System.out.println(arbre.valeur);
		}else {
			System.out.println(arbre.valeur);
			parcours1(arbre.gauche);
			parcours1(arbre.droit);
		}
	}
	
	public static void parcours2(Noeud arbre) {
		if(arbre.isEmpty()) {
			System.out.println(arbre.valeur);
		}else {
			parcours2(arbre.gauche);
			System.out.println(arbre.valeur);
			parcours2(arbre.droit);
		}
	}
	
	public static void parcours3(Noeud arbre) {
		if(arbre.isEmpty()) {
			System.out.println(arbre.valeur);
		}else {
			parcours3(arbre.gauche);
			parcours3(arbre.droit);
			System.out.println(arbre.valeur);
		}
	}
	
	public static int calcul(Noeud arbre) {
		if(arbre.isEmpty()) {
			return Integer.valueOf(arbre.valeur);
		}else {
			calcul(arbre.gauche)
			calcul(arbre.droit)
		}
	}
	
	public static void main(String[] args) {
		Noeud arbre = new Noeud("*",
								new Noeud("+",
										  new Noeud("3"),
										  new Noeud("4")),
								new Noeud("5"));
		parcours1(arbre);
	}

}
