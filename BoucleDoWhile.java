package fr.LesBases;

/**
 * Ce programme demande le nom du User afin de lui souhaiter la bienvenu
 * Il demande egalement au User s'il veut recommencer ou pas, 
 * et tant que il ne repond pas par "oui(O)" ou "non(N)", on continu de lui poser 
 * la question
 */

import java.util.Scanner;

public class BoucleDoWhile {

	public static void main(String[] args) {
		//Instanciation de notre objet scanner;
		Scanner input =new Scanner(System.in);
		
		//Initialisation de notre condition de boucle à une premiere valeur
		
		char reponse='O';
		
		//Utilisation de la boucle do{instruction}...while(condition);
		
		do {
			
			//Demande et recuperation du nom du User
			System.out.println("Quel est votre nom svp ?");
			String name=input.nextLine();
			System.out.println("Bonjour "+name+",\nHeureux de vous retrouver!\n");
			
			//Reinitialisation de notre varible
			reponse=' ';
			do {
				/*
				 * Si le User repond O ou N , on sort de notre boucle,
				 * sinon on n'y reste jusqu'a tant que il reponde 
				 */
				System.out.println("Voulez vous recommencer? (O/N)");
				reponse=input.nextLine().charAt(0); //Recuperation de l'index 0 de la reponse du User
				
			}while(reponse!='O' && reponse!='N');
			
			
			
		}while(reponse=='O');
		System.out.println("Au revoir!");

	}

}
