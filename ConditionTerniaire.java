package fr.LesBases;

import java.util.Scanner;

public abstract class ConditionTerniaire {

	public static void main(String[] args) {
		
		int max; // declaration d'une variable dont on connait pas la valeur
		
		int x=10,y=20; //nos deux variables . L'une d'entres elles devra etre 'max'
		
		
		/**
		 * Si la proposition entre "()" est vraie, alors l'element avant les 
		 * ":" est celle que on choisit pour notre variable.
		 * Si elle est fause, c'est celle apres les ":" qui est retenu
		 */
		max=(x>y)? x : y; //max vaut y=20 
		System.out.println("Max 1 : "+max);
		
		/**
		 * Si x<y est vrai, alors max prend la valeur du resultat de :
		 *  "((x<y)?y%2:y)".
		 * si non max prend la valeur de la variable de l'autre coté des
		 * ":" soit max=x=10;
		 */
		max=(x<y)?((x<y)?y%2:y):x;
		System.out.println("Max 2 : "+max); //vaut 0
		
		

	}

}
