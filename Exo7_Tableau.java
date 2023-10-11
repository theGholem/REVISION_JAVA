package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote ce programme demande a l'user de choisir une taille pour son tableau d'entier 
 *          et suite de quoi l'user devra remplir le tableau.
 *          Le programme doit etre capable de trier les elements saisis dans un ordre croissant
 *          puis ensuite decroissant.
 * 
 * @author Konan
 *
 */

public class Exo7_Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//on demande au user de saisir le nombre de case qu'il veut pour son tableau
		System.out.println("Veuillez saisir la taille de votre tableau svp");
		int taille=sc.nextInt();
		
		int []tab=new int[taille];
		
		//On demande a l'user de saisir les elements de sont tableau
		System.out.println("Veuillez saisir les "+taille+" elements de votre tableau svp");
		for(int i=0;i<tab.length;i++) {
			tab[i]=sc.nextInt();
		}
		
		//on montre au user ce qu'il a saisit
		System.out.println("vous avez saisi : ");
		for(int i=0;i<taille;i++) {
			System.out.print(tab[i]+" ");
		}
		
		//ordre croissant
		for(int i=0;i<taille-1;i++) {
			for(int j=0;j<(taille-i)-1;j++) {
				
				if(tab[j]>tab[j+1]) {
					//on declare un variable qui va recevoir un element du tableau
					int temp=tab[j];
					//ensuite cette variable vas recevoir la variable d'apres
					tab[j]=tab[j+1];
					//Et cette variable d'apres recois la variable initial dans le cas ou la variable
					//initiale est superieur
					tab[j+1]=temp;
				}
			}
		}
		
		//On affiche les elements du tableau dans un ordre croissant
		System.out.println("\nORDRE CROISSANT : ");
		for(int cpt : tab) {
			System.out.print(cpt+" ");
		}
		
		//ordre decroissant
				for(int i=0;i<taille-1;i++) {
					for(int j=0;j<(taille-i)-1;j++) {
						
						if(tab[j]<tab[j+1]) {
							int temp=tab[j];
							tab[j]=tab[j+1];
							tab[j+1]=temp;
						}
					}
				}
				
				System.out.println("\nORDRE DECROISSANT : ");
				for(int cpt : tab) {
					System.out.print(cpt+" ");
				}

	}

}
