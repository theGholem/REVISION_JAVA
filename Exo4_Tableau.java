package fr.LesBases;

/**
 * 
 * 
 * @ApiNote ce programme recupere les saisis de l'utilisateur et lui renvoi le max et le min 
 *          de son tableau.
 *          La taille du tableau ici est defini par le user.
 * 
 * @author Konan
 */

import java.util.Scanner;

public class Exo4_Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Combien d'element possede votre tableau svp");
		int n=sc.nextInt(); //nombre de case dans notre tableau
		
		int tab[]=new int[n]; //initialisation de notre tableau à n elements
		
		System.out.println("Veuillez saisir vos "+n+" elements svp");
		for(int i=0;i<n;i++) {
			tab[i]=sc.nextInt();
		}
		
		int max=tab[0]; // cette variable suppose que l'element d'indice 0 est le max, ainsi donc grace
		                // à une boucle on va parcourir tous les elements du tableau et les comparer avec
		                // notre max
		for(int i=0;i<n;i++) {
			if(tab[i]>max)
				max=tab[i];
		}
		System.out.println("Le maximum est : "+max);
		
		// Pour le minimun c'est pareil, jusque que cette fois c'est l'inverse, cad 
		// l'element du tableau plus petit que le min, est notre nouveau min
		
		int min=tab[0]; 
		for(int i=0;i<tab.length;i++) {
			
			if(tab[i]<min)
				min=tab[i];
		}
		System.out.println("Le minimun est : "+min);
		

	}

}
