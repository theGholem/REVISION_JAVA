package fr.LesBases;

import java.util.Scanner;

/**
 * @apiNote : Recherche dans un tableau.
 *            Le User saisi un element au clavier et on verifie si cet element appartient 
 *            à notre tableau ou pas.
 * 
 * @author Konan
 *
 */

public class Tableau2 {

	public static void main(String[] args) {
		
		//Initialisation de l'objet scanner
		Scanner input=new Scanner(System.in);
		System.out.println("      RECHERCHE DE CARACTERE DANS UN TABLEAU      ");
		System.out.println("--------------------------------------------------");
		
		int i;            // declaration de notre compteur
		char rps='O';    //initialisation de la variable responsable de la repetition du test
		char carac=' '; //initialisation de la variable responsable de la reception du caractere choisi par le user 
		
		//Tableau qui va servir de reference (tableau de caractere) 
		char[]tab= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
		
		do { //1ere boucle ; qui verifie si le user à choisi de recommencer le test ou pas
			 //tant que il choisit 'O' on revient dans la boucle, sinon on lui dit 'aurevoir'
			
			do { // tanque l'index est superieur ou egale à la taille du tableau, 
				 // on revient dans cette boucle
				
				i=0; //initialisation de notre compteur (tres important)
				
				System.out.println("Veuillez saisir un caractere svp");
				carac=input.nextLine().charAt(0);
				
				/**
				 * boucle 'while()' qui parcour le tableau en incrementant à chaque fois et qui s'assure que la
				 * saisie du user correspond ou pas au caractere present dans le tableau. 
				 */
				while(i<tab.length && carac!=tab[i]) 
					i++;
				
				if(i<tab.length) 
					System.out.println("Le caractere "+carac+" appartient à notre tableau de caractere.\nBravo\n!");
				else 
					System.out.println("Le caractere "+carac+" n'appartient pas à notre tableau de caractere.\nDesolé!\n");
				
				
			}while(i>=tab.length);
			
			
			input.nextLine(); //Ici cette ligne est inutile car on utilise qu'une seule fois la variable 'rps' par exemple;
			
			do {
				System.out.println("Voulez vous refaire le test svp ?(0/N) ");
				rps=input.nextLine().charAt(0);
				
				//Aide unpeu l'user a se situer
				if(rps!='N' && rps!='O')
					System.out.println("Vous devez saisir 'N' pour Non et 'O' pour oui");
				
			}while(rps!='O' && rps!='N');
			
		}while(rps=='O');
		
	System.out.println("Merci et au-revoir!");	

	}

}
