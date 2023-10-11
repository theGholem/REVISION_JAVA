package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote : ce programme demande un nombre à un User et affiche sa table de 
 *            multiplication jusqu'a 10
 * 
 * @author Konan
 *
 */
public class Exo2_BoucleFor {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("--------AFFICHAGE DE TABLE DE MULTIPLICATION--------");
		System.out.println("___________________________________________________\n"); 
		
		System.out.println("Veuillez saisir votre nombre svp");
		int n=input.nextInt();
		if(n>=0) {
			System.out.println("\n---------------");
			for(int i=0;i<=10;i++) {
				System.out.println(n+" X "+i+" = "+n*i);
			}
			System.out.println("---------------\n");
		}else {
			System.out.println("Veuillez saisir un entier positif svp");
		}
			
		
		
	}

}
