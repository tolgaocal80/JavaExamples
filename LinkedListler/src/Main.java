import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JSpinner.ListEditor;

public class Main {
	
	/*
	 * Arraylist lerde örnegin 100 elemanlý bir listenin 50. elemaný
	 * silinmek istenildiði zaman, 50. elemaný siler, alttaki 50 diger elemaný da teker teker yukarý
	 * kaydýrýr, bu da LinkedList e göre kaynak kullanýmýný oldukça artýrýr. Arraylist referansý bellekte tek bir obje
	 * gösterir. Bu sebeple daha az yer kaplar, LinkedList bu konuda dezavantajý vardýr, çünkü her bir ögesi bir nesne dir.
	 * Bellekte her bir LinkedList elemaný için bir nesnelik yer açýlýr, bu sebeple ayný sayýda eleman için 
	 * Arraylist lere göre daha çok yer kaplar. LinkedList in performans konusunda avantajý vardýr, çünkü
	 * iþlem yaparken ilgili nesnenin gösterdiði referans la iþlem yapar yani sadece ilgili kýsýmdaki elemanýn önü 
	 * yada arkasý ile iþlem yapar, Arraylistlerdeki gibi her eleman yer deðiþimi için bütün listeyi taþýmaz. 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		LinkedList<String> gidilecekYerler = new LinkedList<>();
	/*	
		gidilecekYerler.add("Postane");		
		gidilecekYerler.add("Market");		
		gidilecekYerler.add("Okul");		
		gidilecekYerler.add("Kütüphane");
		gidilecekYerler.add("Gym");
		gidilecekYerler.add("Ev");
		
		listBastir(gidilecekYerler);
		System.out.println("-------------");
		
	//	gidilecekYerler.add(4, "Alýþveriþ merkezi");
		gidilecekYerler.remove(3);
		listBastir(gidilecekYerler);
		
	*/
		
		siraliEkle(gidilecekYerler, "Postane");
		siraliEkle(gidilecekYerler, "Market");
		siraliEkle(gidilecekYerler, "Ev");
		siraliEkle(gidilecekYerler, "Araba");
		siraliEkle(gidilecekYerler, "Azerbaycan");
		siraliEkle(gidilecekYerler, "Aagac");
		listBastir(gidilecekYerler);
		
	}
	
	
	/*
	 * Harf önceliðine göre sýralý eleman ekler
	 */
	/*
	 * Iterator cursor demektir.
	 * 
	 */
	public static void siraliEkle(LinkedList<String> yerler, String yeni) {
		ListIterator<String> listIterator = yerler.listIterator();
		while(listIterator.hasNext()) {
			int karsilastir = listIterator.next().compareTo(yeni);
			if(karsilastir == 0) {
				System.out.println("Listeniz bu elemaný zaten içeriyor");
				return;
			}else if(karsilastir <0) {
				// yeni deger iterator.next ten daha buyuk
			}else if(karsilastir >0) {
				listIterator.previous();
				listIterator.add(yeni);
				return;
			}
		}
		listIterator.add(yeni);
	}
	
	
	public static void listBastir(LinkedList<String> linkedList) {
		/*
		for (String string : linkedList) {
			System.out.println(string);
		}
		
		  Iterator Javanýn "cursor" larýndan biridir. Ýki nesnenin arasýnda durur,
		  "þuanki" obje diye bi þey yoktur. önceki veya sonraki vardýr.
		*/
		ListIterator<String> listIterator = linkedList.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
