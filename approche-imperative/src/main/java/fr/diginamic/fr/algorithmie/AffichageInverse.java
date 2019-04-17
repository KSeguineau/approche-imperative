package fr.diginamic.fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {

		int[] tab = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int longtab = tab.length;
		int[] arrayCopy = new int[tab.length];
		
		for(int i=0;i<longtab;i++){
			System.out.print(tab[i]+" ");
		}
		
		System.out.println();
		
		for(int i=longtab-1;i>=0;i--){
			System.out.print(tab[i]+" ");
		}
		
		for(int i=0;i<longtab;i++){
			arrayCopy[i] = tab[i];
		}
		
	}

}
