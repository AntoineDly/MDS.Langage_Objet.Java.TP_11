package fr.mds.lo_tp11.launcher;

import java.util.Scanner;

import fr.mds.lo_tp11.utils.Conjuguateur;

public class Launcher {
	
	public static void main(String[] args) {
		String[] verbes = {"manger", "chercher", "prononcer"};
		String verbeSaisi;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Entrez un verbe régulier du premier groupe : ");

		    verbeSaisi = input.nextLine();
		} while(!verbeSaisi.substring(verbeSaisi.length() - 2, verbeSaisi.length()).equals("er") 
				|| verbeSaisi == "aller");
		
		Conjuguateur Conjuguateur1 = new Conjuguateur();
		
		Conjuguateur1.conjugueAvecSaisi(verbes);
		
		System.out.println("");
		System.out.println("");
		
		Conjuguateur1.conjugueAvecSaisi(verbeSaisi);
		
		
		input.close();
	}
	
}
