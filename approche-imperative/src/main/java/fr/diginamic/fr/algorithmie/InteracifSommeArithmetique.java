package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteracifSommeArithmetique {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("entrez un chiffre:");
		int nb = entree.nextInt();
		
		System.out.println((nb*(nb+1))/2);
		entree.close();
	}

}
