package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner entree = new Scanner(System.in);
		boolean chiffre = false;
		int nb=0;
		
		while(chiffre!=true){
		System.out.println("entrez un chiffre:");
		 nb = entree.nextInt();
		if(nb>=1 && nb<=10){
			chiffre=true;
		}
		}
		
		System.out.println(nb);
		entree.close();
	}

}
