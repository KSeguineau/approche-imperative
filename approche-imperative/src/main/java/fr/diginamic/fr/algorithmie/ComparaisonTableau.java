package fr.diginamic.fr.algorithmie;

public class ComparaisonTableau {
	
	public static void main(String[] args){
		//TODO trouver une façon propre proposition avec un break
	ComparaisonTableau comp = new ComparaisonTableau();
	int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
	int[] array2 = {3,1,1, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
	String[] doublon;
	int indDoublon=0;
	int elementCommun = 0;
	
	if(array1.length>=array2.length){
		doublon = new String[array1.length];
	}
	else{
		doublon = new String[array2.length];
	}
	
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array2.length; j++) {
			if((array1[i]==array2[j]) && (comp.exist(Integer.toString(array1[i]),doublon)==false) ){
				elementCommun++;
				doublon[indDoublon] = Integer.toString(array1[i]);
				indDoublon++;
			}
		}
	}
	System.out.println(elementCommun);
	for(String valeur : doublon){
		System.out.print(valeur + " ");
	}
	
}
	
	public boolean exist(String i,String[] tab){
		for (int j = 0; j < tab.length; j++) {
			if(i.equals(tab[j])){
				return true;
			}	
		}
		return false;
	}
	
}