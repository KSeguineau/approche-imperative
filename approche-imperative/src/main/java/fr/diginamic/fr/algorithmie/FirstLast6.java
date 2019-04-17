package fr.diginamic.fr.algorithmie;

import java.util.Random;

public class FirstLast6 {

	public static void main(String[] args) {
		Random gen = new Random();
		//int[] tab = {6,3,6};
		boolean firstLast6 = false;
		int[] tab = new int[100];
		
		
		for (int i = 0; i < tab.length; i++) {
			tab[i]=gen.nextInt(100);
		}
		
		if(tab.length>0 &&(tab[0]==6 ||tab[tab.length-1]==6)){
			firstLast6 = true;
		}
		
		System.out.println(firstLast6);

	}

}
