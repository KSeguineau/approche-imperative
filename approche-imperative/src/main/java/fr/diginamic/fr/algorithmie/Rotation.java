package fr.diginamic.fr.algorithmie;

import java.util.Random;

public class Rotation {

	public static void main(String[] args) {
		Random gen = new Random();
		int[] tab = new int[10];
		int swap;
		
		for (int i = 0; i < tab.length; i++) {
			tab[i]=gen.nextInt(100);
			System.out.print(tab[i]+" ");
		}
		
		swap=tab[tab.length-1];
		for(int i=tab.length-2;i>=0;i--){
			tab[i+1]=tab[i];
		}
		tab[0]=swap;
		
		System.out.println();
		for(int valeur : tab){
			System.out.print(valeur+ " ");
		}
		
	}

}
