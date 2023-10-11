package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote : Ce programme affiche un des motifs en forme d'etoile à l'interieur d'un 
 *            triangle rectangle
 * 
 * @author Konan
 *
 */

public class Exo5_BoucleFor {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Veuillez saisir le nombre de ligne de votre trinagle svp");
		int n=input.nextInt();
		
		System.out.println("\n_____MOTIF OBTENU_____\n");
		
		//1ere boucle for pour afficher le nombre de ligne du triangle
		for(int i=1;i<=n;i++) {
			
			//boucle for imbriqué pour imprimer le motif sur chaque ligne du triangle
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			//Saut de ligne pour revenir à chaque fois à une nouvelle ligne pour tracer notre ligne
			System.out.println();
		}
		input.close();
		
	}

}
