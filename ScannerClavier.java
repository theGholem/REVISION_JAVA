package fr.LesBases;

import java.util.Scanner;

public class ScannerClavier {

	public static void main(String[] args) {
		
		//Instanciation de la classe sacnner 
		
		Scanner input=new Scanner(System.in);
		
		//display name of user
		System.out.println("Veuillez saisir votre nom svp");
		String name=input.nextLine();
		System.out.println("Votre nom est :"+name);
		
		//Vide la ligne avant de passer à la suivante. Elle crée comme une pause
		input.nextLine(); 
		
		
		//display old of user
		System.out.println("Quel est votre age svp");
		int old=input.nextInt();
		System.out.println("Vous avez "+old+" ans");
		
		//display first caractere d'un mot 
		char car1=name.charAt(0); //appel le premier caractere qui est a lindex 0
		char car2=name.charAt(2); //appel le troisieme caractere, index 2
		
		// appel le 9eme caractere s'il existe, index 8, mais genere une erreur 
		// s'il existe pas 
		/* char car3=name.charAt(8); */ 
		
		System.out.println("Voici le premier caractere de votre nom saisi : "+car1);
		System.out.println("Voici le troisieme caractere de votre nom saisi : "+car2);
		
		
		

	}

}
