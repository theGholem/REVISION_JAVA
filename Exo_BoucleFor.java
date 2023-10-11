package fr.LesBases;

/**
 * @apiNote : ce programme affiche la liste des nombres paires entre 0 et 100
 * 
 * @author Konan
 *
 */

public class Exo_BoucleFor {

	public static void main(String[] args) {
		
		System.out.println("--------AFFICHAGE DES NOMBRES PAIRES ENTRE 0 ET 100--------");
		System.out.println("___________________________________________________________\n");
		
		//Boucle permettant de parcourir les nombres entre 0 et 100
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+" ; ");
			}
		}

	}

}
