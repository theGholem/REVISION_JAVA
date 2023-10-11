package fr.LesBases;

/**
 * 
 * @apiNote ce programme decris unpeu un tableau de caractere et ses elements
 * 
 * @author Konan
 *
 */

public class Exo_Tableau {

	public static void main(String[] args) {
		
		
		char[]tab= {'a','b','c','d','e','f','1','2','3','4','5'};
		
		//Affiche '11' : nombre d'element de notre tableau
		System.out.println("Notre tableau contient "+tab.length+" elements");
		//Affiche 'a' : le premier element qui se trouve a l'indice 0 du tableau
		System.out.println("Le premier element se trouve a l'indice 0 et c'est : "+tab[0]);
		//Affiche '5' : le dernier element qui se trouve a l'indice 10 du tableau
		System.out.println("Le dernier element se trouve a l'indice 10 et c'est : "+tab[10]);
		
		System.out.println("\nVoici la liste de nos elements : ");
		
		for(int i=0;i<tab.length;i++) {
			//Affiche tous les elements du tableau suivi de leur indice
			System.out.println("\n'"+tab[i]+"' a pour indice "+i);
		}
	}

}
