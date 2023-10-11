package fr.LesBases;

public class QuelqueClass_utile {
	
public static void main(String[] args) {
		
		//Instanciation et initialisation de nos variable string
		String name=new String("AMIDOU"); //String name="AMIDOU";
		String name2=new String();        //String name2;
		String name3=new String();
		
		/**On va mettre en miniscule notre nom
		 * On utilise la methode "variable.toLowerCase()"
		 */
		name2=name.toLowerCase();
		System.out.println(name2); //affiche : amidou
		
		/**On va mettre en evidence le mot 'DOU' du nom 'AMIDOU'
		 * On utilise la methode "variable.substring(int n1,int n2)"
		 */
		name3=name.substring(3,6);
		System.out.println(name3); //affiche : DOU
		
		/**On va comparer le nom 'AMIDOU' avec les nouveau noms 'AMIDOU',"ADOU" et 'amidou'
		 * On utilise la methode "variable.equals(varble2)" dans les conditions
		 */
		String newName1=new String("AMIDOU");
		String newName2=new String("ADOU");
		String newName3=new String("amidou");
		
		if(name.equals(newName1))//ce qui est vrai ici 'AMIDOU' est egal a 'AMIDOU'
			System.out.println(name+" = "+newName1);
		
		if(!name.equals(newName2)) //ce qui est vrai ici 'AMIDOU' n'est pas egal a 'ADOU'
			System.out.println(name+"!="+newName2);
		
		if(name.equals(newName3)) {
			System.out.println("pour JAVA, 'AMIDOU' est pareil que 'amidou'");
		}else {
			System.out.println("pour JAVA, 'AMIDOU' n'est pas pareil que 'amidou'");
		}
		
		

	}

}
