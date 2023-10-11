package fr.LesBases;

import java.util.Scanner;

public class ConditionSimple {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int old=0;
		System.out.println("Saisir votre age svp");
		old=input.nextInt();
		
		if(old<0) {
			System.out.println("Votre age doit etre une entier positif svp");
		}else if(old<18 && old>12) {
			System.out.println("Vous etes adolescant");
		}else if(old==10 || old==20) {
			System.out.println("Vous avez soit 10 ans, soit 20 ans");
			if(old==10) {
				System.out.println("Precisement 10 ans");
			}else {
				System.out.println("Precisement 20ans");
			}
		}else {
			System.out.println("Vous avez "+old+" ans");
		}
		
		

	}

}
