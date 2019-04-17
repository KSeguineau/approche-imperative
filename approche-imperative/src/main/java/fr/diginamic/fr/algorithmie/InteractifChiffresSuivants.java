package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);

		System.out.println("entrez un chiffre:");
		int nb = entree.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i+nb);
		}
		entree.close();

	}

}
