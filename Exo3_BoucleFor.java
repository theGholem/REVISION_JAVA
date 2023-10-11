package fr.LesBases;

import java.util.Scanner;

/**
 * 
 * @apiNote : Ce programme affiche la somme des nombres de 1 à n ('n' etant un 
 *            nombre saisi par le user)
 * 
 * @author Konan
 *
 */
public class Exo3_BoucleFor {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("--------AFFICHAGE DE LA SOMME DES NOMBRES 1 A N--------");
		System.out.println("_______________________________________________________\n");
		
		System.out.println("Veuillez saisir un nombre entier positif svp");
		int n=input.nextInt();
		
		if(n>0) {
			int rst=0;
			for(int i=0;i<=n;i++) {
				rst=rst+i;
			}
			System.out.println("La somme de 1 a "+n+" est : "+rst);
		}else {
			System.out.println("Veuillez saisir un entier positif svp");
		}

	}

}
