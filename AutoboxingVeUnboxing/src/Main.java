import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		
		/*
		 * Wrapper Class lar
		 * 
		 * boolean (primitive veri tipi olusur, direk olarak belleðin "stack kýsmýnda depolanýrlar") -----> Boolean (belleðin "heap" kýsmýnda depolanýrlar, nesne olustururlar.) 
		 * char -----> Character Class
		 * byte -----> Byte Class
		 * short -----> Short Class
		 * int -----> Integer Class
		 * long -----> Long Class
		 * float -----> Float Class
		 * double -----> Double Class
		 * 
		 */
		
		
		for(int i =0; i<10; i++) {
			// primitive olan i deðerinin otomatik olarak "boxing" yapýldýðýný, 
			// Integer nesnesine çevrildiðini söylüyor.
			// add(i) yapýldýðý zaman, aslýnda IDE nin yaptýðý þudur : add(Integer.valueOf(i))
			arrayList2.add(i);
			arrayList2.add(Integer.valueOf(i));
		}
		
		
		
		for(int i =0; i<arrayList2.size(); i++) {
			// Burada da "unboxing" yapýlýyor yani, Integer nesnesinden int deðeri alýnýyor
			// buna da gerek yok, zaten IDE bunu yapýyor. 
			System.out.println(arrayList2.get(i).intValue());
		}
		
		
	}
	
}
