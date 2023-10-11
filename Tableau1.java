package fr.LesBases;

/**
 * @apiNote : Parcourir les elements d'un tableau en mettant en evidence les indices 
 *            et les elements
 * 
 * @author Konan
 *
 */

public class Tableau1 {

	public static void main(String[] args) {
		
		//Declaration d'un tableau de caractere
		char[]tab= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
		
		//taille de notre tableau à l'aide de la methode 'lenght(longueur)'
		System.out.println("___1ere partie___\nNotre tableau contient "+tab.length+" elements");
		System.out.println("\n___2eme partie___\n");
		/**
		 * Afficher les indices et les elements correspondant à ces indices
		 * A l'aide d'une boucle 'for', on parcour le tableau afin de faire correspondre
		 * aux elements les indices correspondants.
		 */
		for(int i=0;i<tab.length;i++) {
			System.out.println("Pour l'indice "+i+" on à le caractere : "+tab[i]);
		}

	}

}
