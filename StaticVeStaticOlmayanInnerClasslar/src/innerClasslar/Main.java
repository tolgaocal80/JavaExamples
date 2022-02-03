package innerClasslar;

import innerClasslar.StaticInnerClasslar.Alan;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Static inner class lar�n olusuturulma sekli
		 * �nce super class �ndan bir nesne olu�turulup sonra o nesneden i�erdeki inner class a 
		 * ula��l�p oradan bir nesne olusturulur.
		*/
		
		/*
		StatikOlmayanInnerClass.Factorial factorial = new StatikOlmayanInnerClass().new Factorial();
		
		factorial.faktoriyel();
		
		StatikOlmayanInnerClass.Asal asal = new StatikOlmayanInnerClass().new Asal();
		
		System.out.println(asal.asalMi(13));
		
		StatikOlmayanInnerClass.Alan.DaireAlan daireAlan = new StatikOlmayanInnerClass().new Alan().new DaireAlan();
		
		daireAlan.daireAlan(56);
		
		StatikOlmayanInnerClass.Alan alan = new StatikOlmayanInnerClass().new Alan();
		
		alan.kareAlan(45);
		*/
		
		
		// Static inner class tan obje olu�turulurken, super class tan
		// obje olu�turulmaz.
	//	StaticInnerClasslar.Alan alan = new StaticInnerClasslar().new Alan();
		
		
		// Do�ru kullan�m �u sekildedir
		StaticInnerClasslar.Alan alan = new StaticInnerClasslar.Alan();
		
		/* Statik inner class taki statik method a nesne �zerinden 
		 * ya da s�n�f �zerinden eri�ebiliriz.
		 */
		// nesne �zerinden eri�im
		StaticInnerClasslar.Cevre cevre = new StaticInnerClasslar.Cevre();
		cevre.daireCevre(7);
		
		// s�n�f ad� �zerinden eri�im
		StaticInnerClasslar.Cevre.daireCevre(7);
		
		
	}
	
}
