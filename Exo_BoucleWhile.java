package fr.LesBases;

/**
 * 
 * @apiNote : Programme qui verifie si un utilisateur est humain ou pas 
 *            en se basant sur les choix du user
 * 
 * 
 * @author Konan
 */

import java.util.Scanner;

public class Exo_BoucleWhile {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Saisir un entier positif compris entre 210 et 290 svp");
		int n1=input.nextInt();
		System.out.println("Saisir autre entier inferieur a votre premier entier svp");
		int n2=input.nextInt();
		
		if(n1>=210 && n1<=290) {
			
			//si n1 est inf a n2 on comprendra que le user n'ai pas tres futé donc un robot
			//et cela genere une boucle infinie
			while(n1<n2) {
				System.out.println("Bonjour "+n1+" fois");
		}
			System.out.println("Vous avez reussi !");
			
		}else {
			System.out.println("Vous n'avez pas respecté nos conditions concernant le premier entier");
		}
		
		

	}

}
