package fr.diginamic.fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[tab.length];
		
		for(int i=tab.length-1;i>=0;i--){
			arrayCopy[i] = tab[i];
			System.out.print(tab[i]+"|"+arrayCopy[i]+"\n");
		}
		
	}

}
