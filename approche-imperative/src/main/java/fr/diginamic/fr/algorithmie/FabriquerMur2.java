package fr.diginamic.fr.algorithmie;

public class FabriquerMur2 {
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
		
		if(resteMur(nbSmall, nbBig, longueur)==0){
			resultat = true;
		}
		
		
		return resultat;
	}

	static int resteMur(int nbSmall, int nbBig, int longueur){
		if(longueur==0){
			return 0;
		}
		else{
			if(nbBig>0 && longueur>=5){
				return resteMur(nbSmall,nbBig-1,longueur-5);
			}
			else if(nbSmall>0 && longueur>=1){
				return resteMur(nbSmall-1, nbBig, longueur-1);
			}
			else
			{
				return longueur;
			}
		}
	}
	
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " +

					longueur + ") NON passant.");

		}
	}
}