package fr.LesBases;

/**
 * 
 * @apiNote on veut afficher(enumerer) les elements d'un tableau 
 * 
 * @author Konan
 *
 */

public class Tableau5 {

	public static void main(String[] args) {
		
		String [][]tab= {
				{
					"tata","toto","titi","tutu"
				},
				{
					"papa","popo","pipi","pupu"
				},
				{
					"mama","momo","mimi","mumu"
				}
		};
		
		System.out.println("\nAvec la boucle While : \n");
		int i=0;
		while(i<3) {
			int j=0;
			while(j<4) {
				System.out.print(tab[i][j]+" ");
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
