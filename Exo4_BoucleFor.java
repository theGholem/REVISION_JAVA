package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote : Programme qui calcul le factoriel d'un nombre entier positif saisi par 
 *            un User
 * 
 * @author Konan
 *
 */
public class Exo4_BoucleFor {

	public static void main(String[] args) {
		
		//initialisation de l'objet Scanner;
		Scanner input=new Scanner(System.in);
		
		System.out.println("--------CALCUL DU FACTORIEL D'UN ENTIER POSITIF--------");
		System.out.println("________________________________________________________\n");
		
		System.out.println("Veuillez saisir le nombre dont vous voulez connaitre le factoriel svp");
		int n=input.nextInt();
		
		if(n>0) {
			int rst=1;
			
			System.out.println("\n----------");
			for(int i=1;i<=n;i++) {
				/**
				 * n!= n(n-1)*(n-2)*(n-3)*...*1
				 * 
				 * ex : 5!=5*(5-1)*(5-2)*(5-3)*(5-4)
				 *        =5*4*3*2*1
				 *        =120
				 */
				
				rst=rst*i;
			}
			System.out.println(n+" ! = "+rst);
			System.out.println("----------\n");
		}else {
			System.out.println("Vous devez saisir un entier positif svp");
		}

	}

}
