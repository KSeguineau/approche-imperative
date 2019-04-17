package fr.diginamic.fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez une valeur");
		int f = scan.nextInt();
		double pp = 0d;
		double p=1d;
		
		
		System.out.println(pp);
		System.out.println(p);
		for (int i = 0; i <= f; i++) {
	
			System.out.println((p+pp)+" ");
			double tmp =p+pp;
			pp=p;
			p= tmp;
			
		
		}
		scan.close();
	}

	
}
