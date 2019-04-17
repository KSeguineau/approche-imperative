package fr.diginamic.fr.algorithmie;

import java.util.Random;

public class FirstLast {

	public static void main(String[] args) {

		Random gen = new Random();
		//int[] tab = {6,3,6};
		boolean firstLast = false;
		int[] tab = new int[100];
		
		
		for (int i = 0; i < tab.length; i++) {
			tab[i]=gen.nextInt(100);
		}
		
		if(tab.length>0 &&(tab[0]==tab[tab.length-1])){
			firstLast = true;
		}
		
		System.out.println(firstLast);
	}

}
