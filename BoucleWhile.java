package fr.LesBases;

/**
 * Ce programme demande le nom du User afin de lui souhaiter la bienvenu
 * Il demande egalement au User s'il veut recommencer ou pas, 
 * et tant que il ne repond pas par "oui(O)" ou "non(N)", on continu de lui poser 
 * la question
 */

import java.util.Scanner;

public class BoucleWhile {

	public static void main(String[] args) {
		//Declaration de l'objet Scanner
		Scanner input=new Scanner(System.in);
			
		char reponse='O'; //Variable char initialisé à "O"-->vrai
		
		//Utilisation de la boucle while(condition){...instruction...}
		
		while(reponse=='O') {
			
			//Demande et recuperation du nom du User
			System.out.println("Donnez votre nom svp");
			String name=input.nextLine();
			System.out.println("Bonjour "+name+".\nVous allez bien j'espere");
			
			//Reinitialisation de notre variable prenant en compte toute valeur
			reponse=' ';
			
			/**
			 * Tant que le user saisi une lettre autre que 'O' et 'N'
			 * on va penetrer dans cette boucle, et lorsque il saisi
			 * 'O' ou 'N', alors on sort de cette seconde boucle 
			 * et si le user à saisi 'O' on lui dit bienvenu,
			 * et si il à saisi 'N' on sort de notre boucle et on lui
			 * dit Au revoir
			 */
			while(reponse!='O' && reponse!='N') {
			   System.out.println("Voulez vous recommencer?(O/N)");
			   /* Recuperation de l,index 0 de la saisie du User */
			   reponse=input.nextLine().charAt(0);
			     
				}
				
			}
			System.out.println("Merci et au revoir!");

	}

}
