package com;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

public class App {

	public static ArrayList<Integer> newList(int[] tableau) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		for(int e : tableau) {
			liste.add(e);
		}
		return liste;
	}		

	// Utiliser uniquement add, remove(0), isEmpty et get(0)

	public static void afficherListe(ArrayList<Integer> liste) {
		if(!liste.isEmpty()) { // cas d'arret
			System.out.println(liste.get(0));
			liste.remove(0);
			afficherListe(liste);
		}
	}

	// Fonction sommant l'ensemble des elements de la liste
	public static int sommeListe(ArrayList<Integer> liste) {
		if(liste.isEmpty()) { // cas d'arret
			return 0;
		}else {
			int e = liste.get(0);
			liste.remove(0);
			return e + sommeListe(liste);
		}
	}

	public static int sommeListe2(ArrayList<Integer> liste) {
		return sommeListe2_aux(liste, 0);
	}

	public static int sommeListe2_aux(ArrayList<Integer> liste, int somme) {
		if (liste.isEmpty()) {
			return somme;
		}else {
			int e = liste.get(0);
			liste.remove(0);
			return sommeListe2_aux(liste, e + somme);
		}
	}

	public static ArrayList<Integer> carreListe(ArrayList<Integer> liste){
		return carreListe_aux(liste, new ArrayList<Integer>());
	}

	public static ArrayList<Integer> carreListe_aux(ArrayList<Integer> liste,
			ArrayList<Integer> liste_carre){
		if (liste.isEmpty()) {
			return liste_carre;
		} else {
			int e = liste.get(0);
			liste.remove(0);
			liste_carre.add(e * e);
			return carreListe_aux(liste, liste_carre);
		}
	}

	public static ArrayList<Integer> concatenation(ArrayList<Integer> liste_a,
			ArrayList<Integer> liste_b){
		if (liste_b.isEmpty()) {
			return liste_a;
		}else {
			int e = liste_b.get(0);
			liste_b.remove(0);
			liste_a.add(e);
			return concatenation(liste_a, liste_b);
		}
	}

	public static ArrayList<Integer> sommeVecteur(ArrayList<Integer> u,
			ArrayList<Integer> v){
		return sommeVecteur_aux(u, v, new ArrayList<Integer>());
	}

	public static ArrayList<Integer> sommeVecteur_aux(ArrayList<Integer> u,
			ArrayList<Integer> v,
			ArrayList<Integer> res){
		if (u.isEmpty() || v.isEmpty()) {
			return res;
		} else {
			int e_u = u.get(0);
			int e_v = v.get(0);
			u.remove(0);
			v.remove(0);
			res.add(e_u + e_v);
			return sommeVecteur_aux(u, v, res);
		}
	}

	public static void main(String[] args) {
		int[] tab_a = {2, 5, 3};
		ArrayList<Integer> liste_a = newList(tab_a);
		int[] tab_b = {1, 3, 7};
		ArrayList<Integer> liste_b = newList(tab_b);
		System.out.println(sommeVecteur(liste_a, liste_b));
		System.out.println(sommeVecteur(liste_a, liste_b));
	}

}
