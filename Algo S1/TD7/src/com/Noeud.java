package com;

public class Noeud {
	String valeur;
	Noeud gauche;
	Noeud droit;
	
	Noeud(String valeur) {
		this.valeur = valeur;
	}
	
	Noeud(String valeur, Noeud gauche, Noeud droit){
		this.valeur = valeur;
		this.gauche = gauche;
		this.droit = droit;
	}
	
	boolean isEmpty() {
		return (gauche == null) || (droit == null);
	}
}
