package fr.diginamic.fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {

		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i]>max){
				max = tab[i];
			}
		}
		System.out.println(max);
	}

}
