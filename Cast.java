package fr.LesBases;

	public class Cast {
		
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
		
		int i=8; //Declaration d'une variable de type int
		
		
		float j=(float)i; //Conversion du int en float
		System.out.println(j);
		
		int k1=12;
		double k2=13.66d;
		
		
		double k3=(double)k1; //12.0
		System.out.println(k3);
		
		
		int k4=(int)k2; //13
		System.out.println(k4);
		
		
		double nbre1=10d,nbre2=3d;
		
		double rst1=nbre1/nbre2; 
		System.out.println(rst1); // 3.33
		
		int rst2=(int)rst1; 
		System.out.println(rst2); //3
		
		double m1=5,m2=2;
		int rstm=(int)m1/(int)m2;
		System.out.println(rstm); // 2
		
		double rstm2=(double)rstm;
		System.out.println(rstm2); //2.0
		
		double rstm3= m1/m2;
		System.out.println(rstm3); //2.5
		
		//avec les chaines de caractere
		
		int n=12; //declaration d'un entier
		
		String z=new String(); //Instanciation avec String
		z=z.valueOf(n);   //Z qui est une str recoit la valeur de l'entier n
		System.out.println(z); //12
		int w=Integer.valueOf(n).intValue();
		System.out.println(w); //12
	

	}

}
