package fr.diginamic.fr.tableaux;

import java.util.Random;

public class Exercice2 {

	public static void main(String[] args) {
		
		int[][] tab = new int[2][];
		Random gen = new Random();
		tab[0] = new int[3];
		tab[1] = new int[5];
		int iDerl = tab.length-1;
		int iDerc = tab[tab.length-1].length-1;
		
		for(int i=0;i<=iDerl;i++){
			for(int j=0;j<=tab[i].length-1;j++){
				tab[i][j]=gen.nextInt(100);
				System.out.print(tab[i][j]+"|");
			}
			System.out.println();
		}
		
		System.out.println(tab.length+" "+tab[0].length+" "+tab[1].length+" "+tab[0][0]+ " "+tab[iDerl][iDerc]);
	}

}
