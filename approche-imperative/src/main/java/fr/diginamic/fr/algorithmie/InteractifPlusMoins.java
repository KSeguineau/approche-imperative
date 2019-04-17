package fr.diginamic.fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		Random gen =new Random();
		Scanner scan = new Scanner(System.in);
		int secretNb = gen.nextInt(100)+1;
		int nb=-1;
		int nbCoups=0;
		boolean bravo=false;
		
		
		while(bravo==false){
			System.out.println("indiquez un nombre entre 1 et 100");
			nb = scan.nextInt();
			if(nb==secretNb){
				System.out.println("Bravo, vous avez trouvé en "+(nbCoups+1)+" coups");
				bravo=true;
			}else
			{
				if(nb>secretNb){
					System.out.println("c'est moins");
					nbCoups++;
				}
				else{
					System.out.println("c'est plus");
					nbCoups++;
				}
			}
				
		}
		scan.close();
	}

}
