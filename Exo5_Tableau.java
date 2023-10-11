package fr.LesBases;

/**
 * 
 * @ApiNote programme qui calcule le totale et la moyenne des elements saisi par un user
 * 
 * 
 * @author Konan
 */

import java.util.Scanner;

public class Exo5_Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Combien de note avez vous svp");
		int n=sc.nextInt(); //correspond ici au nombre d'element de notre tableau
		
		int tab[]=new int[n];
		
		System.out.println("Veuillez saisir vos "+n+" notes svp");
		for(int i=0;i<n;i++) {
			tab[i]=sc.nextInt();
		}
		int sum=0; //on initialise la variable ui represente la somme de nos elements du tableau
		
		//boucle for qui permet de parcourir chaque elements du tableau
		for(int cpt : tab) {
			sum=sum+cpt; //calcul la somme des elements du tableau
		}
		System.out.println("Le total vaut : "+sum);
		
		double avrg=sum/n; // on calcule la moyenne en fesant la somme divisé par le nombre d'elements
		System.out.println("La moyenne vaut : "+avrg);
		

	}

}
