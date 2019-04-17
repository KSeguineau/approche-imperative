package fr.diginamic.fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int swap;
		boolean trier=false;
		
		while(!trier){
			trier=true;
			for (int i = 0; i < array2.length-1; i++) {
				if(array2[i]>array2[i+1]){
					trier=false;
					swap=array2[i];
					array2[i]=array2[i+1];
					array2[i+1] = swap;
				}
			}
		}
		for(int valeur : array2){
			System.out.print(valeur + " ");
		}
	}

}
