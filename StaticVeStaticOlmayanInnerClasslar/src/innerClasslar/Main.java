package innerClasslar;

import innerClasslar.StaticInnerClasslar.Alan;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Static inner class larýn olusuturulma sekli
		 * önce super class ýndan bir nesne oluþturulup sonra o nesneden içerdeki inner class a 
		 * ulaþýlýp oradan bir nesne olusturulur.
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
		
		
		// Static inner class tan obje oluþturulurken, super class tan
		// obje oluþturulmaz.
	//	StaticInnerClasslar.Alan alan = new StaticInnerClasslar().new Alan();
		
		
		// Doðru kullaným þu sekildedir
		StaticInnerClasslar.Alan alan = new StaticInnerClasslar.Alan();
		
		/* Statik inner class taki statik method a nesne üzerinden 
		 * ya da sýnýf üzerinden eriþebiliriz.
		 */
		// nesne üzerinden eriþim
		StaticInnerClasslar.Cevre cevre = new StaticInnerClasslar.Cevre();
		cevre.daireCevre(7);
		
		// sýnýf adý üzerinden eriþim
		StaticInnerClasslar.Cevre.daireCevre(7);
		
		
	}
	
}
