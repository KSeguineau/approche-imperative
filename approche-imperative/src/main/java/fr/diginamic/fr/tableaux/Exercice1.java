package fr.diginamic.fr.tableaux;

/**
 * Hello world!
 *
 */
public class Exercice1 
{
    public static void main( String[] args )
    {
    	int[] tab ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(""+ tab[0]+" "+tab[9]+" "+tab.length);
        System.out.println(tab[4]);
        //indice 10 de notre tableau n'éxiste pas
        System.out.println(tab[4]=8);
    
        
    }
}
