package fr.diginamic.fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]>3){
			System.out.print(tab[i]+" ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]%2==0){
			System.out.print(tab[i]+" ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < tab.length; i++) {
			if(i%2==0){
			System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]%2==1){
			System.out.print(tab[i]+" ");
			}
		}
		
	}

}
