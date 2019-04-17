package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
Scanner entree = new Scanner(System.in);
		
		
		int max=Integer.MIN_VALUE;
		int[] tab =new int[10];
		
		for (int i = 0; i <10; i++) {
			System.out.println("entrez un chiffre:");
			tab[i]= entree.nextInt();
			if(tab[i]>max){
				max=tab[i];
			}
		}
		
		System.out.println(max);
		entree.close();
	}

}
