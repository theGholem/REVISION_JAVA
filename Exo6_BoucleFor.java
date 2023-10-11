package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote : Ce programme affiche des ligne à l'interieur d'une 
 *            pyramide(Triangle equilaterale);
 * 
 * @author Konan
 *
 */

public class Exo6_BoucleFor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Veuillez saisir la hauteur de votre pyramide svp");
		int h=input.nextInt();
		
		System.out.println("\n_____MOTIF OBTENU_____\n");
		
		//boucle for pour afficher la hauteur(nombre de ligne de la pyramide)
		for(int ligne=1;ligne<=h;ligne++) {
			
			//1ere boucle imbriquée pour afficher un espacement à gauche
			for(int espace=1;espace<=h-ligne;espace++) {
				System.out.print(" ");
			}
			
			//2eme boucle imbriquée pour imprimer les motifs à l'interieur des lignes
			for(int etoile=1;etoile<=2*ligne-1;etoile++) {
				System.out.print("_");
			}
			
			//Saut de ligne après tracé d'une ligne
			System.out.println();
		}
		
		input.close();
		

	}

}
