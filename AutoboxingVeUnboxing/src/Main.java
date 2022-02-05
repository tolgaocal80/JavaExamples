import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		
		/*
		 * Wrapper Class lar
		 * 
		 * boolean (primitive veri tipi olusur, direk olarak belle�in "stack k�sm�nda depolan�rlar") -----> Boolean (belle�in "heap" k�sm�nda depolan�rlar, nesne olustururlar.) 
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
			// primitive olan i de�erinin otomatik olarak "boxing" yap�ld���n�, 
			// Integer nesnesine �evrildi�ini s�yl�yor.
			// add(i) yap�ld��� zaman, asl�nda IDE nin yapt��� �udur : add(Integer.valueOf(i))
			arrayList2.add(i);
			arrayList2.add(Integer.valueOf(i));
		}
		
		
		
		for(int i =0; i<arrayList2.size(); i++) {
			// Burada da "unboxing" yap�l�yor yani, Integer nesnesinden int de�eri al�n�yor
			// buna da gerek yok, zaten IDE bunu yap�yor. 
			System.out.println(arrayList2.get(i).intValue());
		}
		
		
	}
	
}
