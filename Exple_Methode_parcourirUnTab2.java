package fr.LesBases;

public class Exple_Methode_parcourirUnTab2 {

	public static void main(String[] args) {
		
		//Initialisation de notre tableau
		String[]tableau= {"titi","tata","toto","tutu"};
				
		//Appel de la fonction displayTab afin d'afficher les elements du tab
		displayTab(tableau);//puis que la methode defini deja l'affichage, donc cette ligne
				                    //affichera les elements de notre tableau
		
		/*Appel de la fonction toString
		 * 
		 * cette fonction ne pauc pas s'afficher tous seul car elle retour quelque chose
		 * alors on vas la faire s'afficher ici
		 */
		System.out.println(toString(tableau));//affiche le tableau selon les criteres de la fonction toString

	}
	
	/**
	 * @apiNote cette methode permet de parcourir les elements d'un tableau
	 * 
	 * @param TAB
	 */
	public static void displayTab(String[]tab) {
		
		for(String str : tab)
			System.out.print(str+" ");
		
	}
	
	/**
	 * 
	 * @param Tab
	 * @return une haine de caractere
	 */
	public static String toString(String[]Tab) {
		//declaration et initialisation de notre valeur de retour
		String back="\n\n";
		
		for(String str : Tab)
			back+=str+"\n"; //on ajoute à chaque fois la valeur
		//retour
		return back;
	}

}
