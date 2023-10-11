package fr.LesBases;

public class Exple_Methode_parcourirUnTab {

	public static void main(String[] args) {
		
		//Initialisation de notre tableau
		String[]tableau= {"titi","tata","toto","tutu"};
		
		//Appel de la fonction ParcourTab afin d'afficher les elements du tab
		ParcourTab(tableau);//puis que la methode defini deja l'affichage, donc cette ligne
		                    //affichera les elements de notre tableau
		System.out.println("\nFIN");

	}
	
	/**
	 * @apiNote cette methode permet de parcourir les elements d'un tableau
	 * 
	 * @param TAB
	 */
	public static void ParcourTab(String[]tab) {
		System.out.println("Les elements de notre tableau sont : ");
		for(String str : tab)
			System.out.print(str+" ");
	}

}
