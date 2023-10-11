package fr.LesBases;

/**
 * 
 * @apiNote programme qui demande a un User de saisir son nom et le programme 
 *          lui souhaite bienvenu, suite de quoi on lui demande s'il veut 
 *          recommencer ou pas.
 * 
 * @author Konan
 * 
 */

import java.util.Scanner;

public class Exo_BoucleDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String name;
		char rps='O';
		do {
			System.out.println("Veuillez saisir votre nom svp ");
			name=sc.nextLine();
			
			System.out.println("Bienvenu "+name);
			
			do {
				rps=' ';
				System.out.println("Voulez vous reesayer?");
				rps=sc.nextLine().charAt(0);
				
				if(rps!='O' && rps!='N') {
					System.out.println("Veuillez saisir svp 'O' pour oui et 'N' pour non");
				}
				
				
			}while(rps!='O' && rps!='N');
			
		}while(rps=='O');
		System.out.println("Au revoir");

	}

}
