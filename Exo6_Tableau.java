package fr.LesBases;

import java.util.Scanner;

public class Exo6_Tableau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char rps='O';
		char mod=' ';
		
		System.out.println("Combien d'element y a t'il dans votre tableau svp ?");
		int n=sc.nextInt();
		
		
		int[]tab=new int[n];
		
		do {
			
			System.out.println("Veuillez saisir vos "+n+" elements svp");
			for(int i=0;i<n;i++) {
				tab[i]=sc.nextInt();
			}
			
			System.out.print("\nVous avez saisi le tableau suivant : \n[ ");
			for(int i=0;i<n;i++) {
				System.out.print(tab[i]+" ");
			}
			System.out.print(" ]\n");
			
					
					
					do {
						sc.nextLine();
						System.out.println("Choisissez une option svp :\n");
						System.out.println("A : Connaitre la moyenne des nombres saisis\nB : Connaitre le maximum des nombres"
								+ " saisis\nC : Connaitre le minimum des nombre saisis\nD : Abandonner\n");
						mod=sc.nextLine().charAt(0);
						
						switch(mod) {
						
						case 'A' :
							int sum=0;
							for(int cpt : tab) {
								sum=sum+cpt;
							}
							double avrg=sum/n;
							System.out.println("\nLa moyenne de vos "+n+" elements est : "+avrg);
							break;
							
						case 'B' :
							int max=tab[0];
							for(int i=0;i<n;i++) {
								if(tab[i]>max) {
									max=tab[i];
								}
							}
							System.out.println("Le maximun de vos "+n+" elements est : "+max);
							break;
							
						case 'C' :
							int min=tab[0];
							for(int i=0;i<n;i++) {
								if(tab[i]<min) {
									min=tab[i];
								}
							}
							System.out.println("Le minimum de vos "+n+" elements est : "+min);
							break;
						case 'D' :
							System.out.println("Dommage que vous n'ayez rien choisit\n");
							break;
							
						default:
							
						}
						
					}while(mod!='A' && mod!='B' &&mod!='C' && mod!='D');
					
					do {
				
				System.out.println("Voulez vous recommencer tous les programmes ?(O/N)");
				rps=sc.nextLine().charAt(0);
				
			}while(rps!='O' && rps!='N');
			
		}while(rps=='O');
		
		System.out.println("Merci et au revoir!!");

	}

}
