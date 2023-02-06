package com;

import java.util.Scanner;

public class App {

	public static int newInt() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir entier : ");
		int entier = clavier.nextInt();
		return entier;
	}
	
	public static int newInt(String message) {
		Scanner clavier = new Scanner(System.in);
		System.out.print(message);
		int entier = clavier.nextInt();
		return entier;
	}
	
	public static void main(String[] args) {
		int taille = newInt("Saisir taille : ");
		int poids = newInt("Saisir poids : ");
		int age = newInt("Saisir age : ");
		System.out.println("Taille : " + taille);
		System.out.println("Poids : " + poids);
		System.out.println("Age : " + age);
	}

}
