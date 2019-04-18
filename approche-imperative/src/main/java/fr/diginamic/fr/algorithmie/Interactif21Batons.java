package fr.diginamic.fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
	
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();
	private int batons = 21;
	private int nbBatonsJoueur = 0;
	boolean fini = false;

	

	public void tourJoueur(){
		System.out.println("Voici "+batons+" batons, vous pouvez en prendre 1, 2 ou 3");
		nbBatonsJoueur = scan.nextInt();
		
		if(nbBatonsJoueur>0 && nbBatonsJoueur<4)
		{
			if(batons - nbBatonsJoueur<=0){
				System.out.println("vous avez perdu");
				fini = true;
			}
			else{
				batons = batons - nbBatonsJoueur;
			}
		}	
	}
	
	public void tourIaFacile(){
		int tmp =rand.nextInt(3)+1;
		if(batons - tmp<=0){
			System.out.println("l'IA à perdu");
			fini =true;
		}
		else{
			batons = batons - tmp;
			System.out.println("l'IA a pris "+ tmp + " batons");
		}
		
	}
	
	public void tourIaImpossible(){
		int tmp = 4-nbBatonsJoueur;
		if(batons - tmp<=0){
			System.out.println("l'IA à perdu");
			fini =true;
		}
		else{
			batons = batons - tmp;
			System.out.println("l'IA a pris "+ tmp + " batons");
		}
		
	}
	
	public static void main(String[] args) {
		Interactif21Batons jeu = new Interactif21Batons();
		int lvl =0;
		
		System.out.println("1 pour facile, 2 pour impossible");
		lvl = jeu.scan.nextInt();
		
		while(!jeu.fini){
			
			jeu.tourJoueur();
			if(lvl ==1 && !jeu.fini){
				jeu.tourIaFacile();
			}
			else if(lvl==2 && !jeu.fini){
				jeu.tourIaImpossible();
			}
			
		}
		
		

	}
}
