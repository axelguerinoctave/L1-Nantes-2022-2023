package com;

import java.util.ArrayList;

public class App {

	
	// Utiliser uniquement add, remove(0), isEmpty et get(0)
	
	public static void afficherListe(ArrayList<Integer> liste) {
		if(!liste.isEmpty()) {
			System.out.println(liste.get(0));
			liste.remove(0);
			afficherListe(liste);
		}
	}
	
	// Fonction sommant l'ensemble des elements de la liste
	public static int sommeListe(ArrayList<Integer> liste) {
		if(liste.isEmpty()) {
			return 0;
		}else {
			int e = liste.get(0);
			liste.remove(0);
			return e + sommeListe(liste);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			liste.add(i);
		}
		
		//afficherListe(liste);
		System.out.println(sommeListe(liste));
		
		
		/*
		System.out.println(liste.isEmpty());
		
		System.out.println(liste.get(6)); // equivalent tableau[6]
		liste.remove(0);
		System.out.println(liste);*/
	}

}
