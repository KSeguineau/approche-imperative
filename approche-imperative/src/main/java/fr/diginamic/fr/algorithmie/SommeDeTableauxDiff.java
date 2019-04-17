package fr.diginamic.fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int[] tabSom;

		if (tab1.length >= tab2.length) {
			tabSom = new int[tab1.length];
		} else {
			tabSom = new int[tab2.length];
		}

		if (tab1.length >= tab2.length) {
			for (int i = 0; i < tab1.length; i++) {
				if (i < tab2.length) {
					tabSom[i] = tab1[i] + tab2[i];
				} else {
					tabSom[i] = tab1[i];
				}
				System.out.print(tabSom[i]+" ");
			}
		} else {
			for (int i = 0; i < tab2.length; i++) {
				if (i < tab1.length) {
					tabSom[i] = tab1[i] + tab2[i];
				} else {
					tabSom[i] = tab2[i];
				}
				System.out.print(tabSom[i]+" ");
			}
		}
	}

}
