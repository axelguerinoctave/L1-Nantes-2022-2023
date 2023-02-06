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
	
	public static boolean isNumber(String e) {
		boolean is_op1 = e.equals("+");
		boolean is_op2 = e.equals("*");
		boolean is_op3 = e.equals("-");
		boolean is_op4 = e.equals("/");
		return !is_op1 && !is_op2 && !is_op3 && !is_op4;
	}
	
	public static ArrayList<ArrayList<String>> split(ArrayList<String> liste_gauche, ArrayList<String> liste_droite, int nb_number, int nb_op){
		if (nb_number == nb_op + 1) {
			ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
			result.add(liste_gauche);
			result.add(liste_droite);
			return result;
		}else {
			String e = liste_droite.get(0);
			liste_gauche.add(e);
			liste_droite.remove(0);
			if (isNumber(e)) {
				nb_number++;
			}else {
				nb_op++;
			}
			return split(liste_gauche, liste_droite, nb_number, nb_op);
		}
	}
	
	public static Noeud remplirArbre(String exp) {
		ArrayList<String> liste = stringToList(exp);
		return remplirArbre_aux(liste);
	}
	
	public static Noeud remplirArbre_aux(ArrayList<String> liste) {
		if (isNumber(liste.get(0))) {
			return new Noeud(liste.get(0));
		}else {
			String e = liste.get(0);
			liste.remove(0);
			ArrayList<ArrayList<String>> branches = split(new ArrayList<String>(), liste, 0, 0);
			return new Noeud(e, remplirArbre_aux(branches.get(0)), remplirArbre_aux(branches.get(1)));
		}
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
