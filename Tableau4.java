package fr.LesBases;

/**
 * 
 * @apiNote on veut afficher(enumerer) les elements d'un tableau en utilisant 
 *          la boucle for de facon particuliere
 * 
 * @author Konan
 *
 */

public class Tableau4 {

	public static void main(String[] args) {
		
		String []tab= { "toto","eli","tata","papa","mama"
				
		};
		
		System.out.println("Avec une boucle while : \n");
		int i=0;
		while(i<5) {
			System.out.println(tab[i]);
			i++;
		}
		
		System.out.println("\nAvec une boucle for specialisée : \n");
		for(String str : tab)  //'str' est du meme type que le tableau et compte ces elements
			System.out.println(str); //System.out.print(str+" ");

	}

}
