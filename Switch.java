package fr.LesBases;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 
		 System.out.println("Saisir un nombre entier positif compris entre 0 et 100 svp");
		 int n=input.nextInt();
		 
		 switch(n) {
		 case 0 : 
			 System.out.println("Vous auriez pu choisir autre que ' 0 ' !");
			 break;
		 case 100 :
			 System.out.println("Vous n'auriez pas pu choisir mieux que ' 100 ' ?");
			 break;
		default :
			if(n>100) {
				System.out.println(n+" > 100\nVous devez choisir un nombre compris entre 0 et 100");
			}else if(n<0) {
				System.out.println(n+" < 0\nOn vous as demandé un entier positif");
			}else {
				System.out.println("Vous avez saisi : "+n);
			}
			
		 }

	}

}
