package fr.diginamic.fr.algorithmie;

public class FabriquerMur {
	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false;
		int nb1=nbSmall;
		int nb5=nbBig;
		int reste=longueur;
		
		while( nb5>0 && reste >=5){
			reste = reste-5;
			nb5--;		
		}
		
		while(nb1>0 && reste>=1){
			reste--;
			nb1--;
		}
		
		if(reste==0){
			resultat = true;
		}
		
		
		

		// TODO: implémenter l'algo
		return resultat;
	}

	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " +

					longueur + ") NON passant.");

		}
	}
}
