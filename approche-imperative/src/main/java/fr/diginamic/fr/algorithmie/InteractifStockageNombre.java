package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		InteractifStockageNombre c = new InteractifStockageNombre();
		Scanner scan = new Scanner(System.in);
		int[] tab = new int[0];
		
		boolean sortir = false;
		
		while(sortir == false){
			System.out.println("1 pour entrer une valeur");
			System.out.println("2 pour afficher le tableau");
			System.out.println("3 pour sortir");
			int cmd = scan.nextInt();
			
			switch(cmd){
			case 1:
				System.out.println("entrez une valeur");
				int valeur = scan.nextInt();
				tab = c.ajoutNombre(valeur, tab);
				break;
			case 2:
				c.afficherTab(tab);
				break;
			case 3:
				sortir = true;
				break;
			default :
				break;
			}

			
		}
		
		
		
	}

	public int[] ajoutNombre(int a,int[] t){
		 int[] tmp = new int[t.length+1];
		 for (int i = 0; i < tmp.length-1  && t.length>0; i++) {
			tmp[i]= t[i];
		}
		 tmp[tmp.length-1]=a;
		 return tmp;
	}
	
	public void afficherTab(int[] t){
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]+" ");
			
		}
		System.out.println();
	}
}

