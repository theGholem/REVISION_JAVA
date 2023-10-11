package fr.LesBases;

public class BoucleFor {

	public static void main(String[] args) {
		
		//incrementation de i allant de 1 à 10
		for(int i=1;i<=10;i++) {
			System.out.println("Voici la ligne "+i);
		}
		
		System.out.println(" \n ");
		
		//on fais ici une decrémentation 10 à 0
		for(int i=10;i>=0;i--) {
			System.out.println("Il reste "+i+" ligne à ecrire(s)");
		}
	}

}
