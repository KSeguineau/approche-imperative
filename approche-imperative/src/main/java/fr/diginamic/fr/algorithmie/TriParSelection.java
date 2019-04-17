package fr.diginamic.fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int indSwap=0;
		int ind = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = ind; j < array2.length; j++) {
				if(array2[j]<min){
					min = array2[j];
					indSwap=j;
				}
			}
			array2[indSwap]=array2[ind];
			array2[ind]=min;
			System.out.print(array2[ind]+" ");
			ind++;
			min=Integer.MAX_VALUE;
			indSwap=ind;
			
		}
	}

}
