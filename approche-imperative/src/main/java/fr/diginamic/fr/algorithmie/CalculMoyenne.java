package fr.diginamic.fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
	
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int somme = 0;
		float moyenne;
		
		for(int valeur : tab){
			somme += valeur;
		}
		
		moyenne = (float)somme/(float)tab.length;
		System.out.println(moyenne);
	}

}
