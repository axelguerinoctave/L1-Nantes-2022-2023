package com;

import java.util.ArrayList;

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
			if(arbre.valeur.equals("+")) {
				return calcul(arbre.gauche) + calcul(arbre.droit);
			}else if(arbre.valeur.equals("*")) {
				return calcul(arbre.gauche) * calcul(arbre.droit);
			}else if(arbre.valeur.equals("-")) {
				return calcul(arbre.gauche) - calcul(arbre.droit);
			}else{
				return calcul(arbre.gauche) / calcul(arbre.droit);
			}
		}
	}
	
	public static ArrayList<String> stringToList(String exp){
		return stringToList_aux(exp, new ArrayList<String>(), "");
	}
	
	public static ArrayList<String> stringToList_aux(String exp, 
													 ArrayList<String> liste,
													 String nombre_stock){
		if(exp.equals("")) {
			liste.add(nombre_stock);
			return liste;
		}else {
			String e = exp.substring(0, 1); //get(0)
			exp = exp.substring(1); //remove(0);
			if(e.equals(" ")) {
				liste.add(nombre_stock);
				nombre_stock = "";
			}else {
				nombre_stock += e;
			}
			return stringToList_aux(exp, liste, nombre_stock);
		}
	}
	
	public static Noeud remplirArbre(String exp) {
		ArrayList<String> liste = stringToList(exp);
		return remplirArbre_aux(liste);
	}
	
	public static Noeud remplirArbre_aux(ArrayList<String> liste) {
		return null;
	}
	
	public static void main(String[] args) {
		Noeud arbre = new Noeud("*",
								new Noeud("+",
										  new Noeud("3"),
										  new Noeud("4")),
								new Noeud("5"));
		System.out.println(calcul(remplirArbre("* + 32 4 5")));
	}

}
