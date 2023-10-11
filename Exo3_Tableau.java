package fr.LesBases;

/**
 * 
 * @ApiNote  ce programme demande a un User de saisir un nombre precis d'elements qui
 *           seront tous ajouté dans un tableau defini
 * 
 * 
 * @author Konan
 */

import java.util.Scanner;

public class Exo3_Tableau {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int tab[]=new int[5]; //initialisation de notre tableau a 5 cases contenant '0'(case vide)
	
		
		System.out.println("Veuillez saisir les 5 elements du tableau svp : \n");
		
		//boucle permettant a le user de saisir 5 fois de suite les chiffres recherchés
		for(int i=0;i<5;i++) {
			System.out.println("Saisir la valeur d'index "+i);
			tab[i]=sc.nextInt();
		}
		
		//boucle affichant les elemts saisis au sein du tableau
		System.out.print("\nLes elements de votre tableau sont : \n[");
		for(int i=0;i<5;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.print("] ");
		
		
		

	}

}
