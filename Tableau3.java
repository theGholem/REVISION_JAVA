package fr.LesBases;

public class Tableau3 {

	public static void main(String[] args) {
		
		int [][]tab= {{1,2,3,4,5},{4,5,6,9,1},{3,9,8,7,6}};
		
		//affichage du contenu de notre tableau via la boucle 'for'
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//affichage du contenu de notre tableau via la boucle 'for'
		int i=0;
		while(i<3) {
			int j=0;
			while(j<5) {
				System.out.print(tab[i][j]);
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
