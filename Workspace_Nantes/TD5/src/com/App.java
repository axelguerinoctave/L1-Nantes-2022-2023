package com;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

public class App {

	
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
	
	public static ArrayList<Integer> sommeVecteur(ArrayList<Integer> u, 
												  ArrayList<Integer> v){
		if(u.isEmpty() || v.isEmpty()) {
			
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>(List.of(1,2,3));
		System.out.println(sommeListe2(liste));
	}

}
