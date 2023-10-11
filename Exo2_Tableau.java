package fr.LesBases;

import java.util.Scanner;

public class Exo2_Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char[]tab={'a','b','c','d','e','f','g'};
		
		int i;
		char carac=' ',rps='O';
		
		do {
			do {
				i=0;
				System.out.println("Veuillez saisir votre caractere svp");
				carac=sc.nextLine().charAt(0);
				
				while(i<tab.length && carac!=tab[i])
					i++;
				if(i<tab.length)
					System.out.println("'"+carac+"' appartient au tableau");
				else
					System.out.println("'"+carac+"' n'appartient au tableau");
				
			}while(i>=tab.length);
			
			do {
				System.out.println("Voulez vous recommencer ? (O/N)");
				rps=sc.nextLine().charAt(0);
				
				if(rps!='N' && rps!='O')
					System.out.println("Vous devez saisir 'N' pour Non et 'O' pour oui");
				
			}while(rps!='N' && rps!='O');
			
		}while(rps=='O');
		System.out.println("Au revoir!!");

	}

}
