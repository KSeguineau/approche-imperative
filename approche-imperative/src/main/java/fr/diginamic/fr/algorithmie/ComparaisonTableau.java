package fr.diginamic.fr.algorithmie;

public class ComparaisonTableau {
	
	public static void main(String[] args){
	ComparaisonTableau comp = new ComparaisonTableau();
	int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
	int[] array2 = {3,1,1, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
	Integer[] doublon;
	int indDoublon=0;
	int elementCommun = 0;
	
	if(array1.length>=array2.length){
		doublon = new Integer[array1.length];
	}
	else{
		doublon = new Integer[array2.length];
	}
	
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array2.length; j++) {
			if((array1[i]==array2[j]) && !(comp.exist(array1[i],doublon)) ){
				elementCommun++;
				doublon[indDoublon] = new Integer(array1[i]);
				indDoublon++;
			}
		}
	}
	System.out.println(elementCommun);
	for(Integer valeur : doublon){
		System.out.print(valeur + " ");
	}
	
}
	
	public boolean exist(int i,Integer[] tab){
		Integer tmp = new Integer(i);
		for (int j = 0; j < tab.length; j++) {
			if(tmp.equals(tab[j])){
				
				return true;
			}	
		}
		return false;
	}
	
}