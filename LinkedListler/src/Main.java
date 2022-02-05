import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JSpinner.ListEditor;

public class Main {
	
	/*
	 * Arraylist lerde �rnegin 100 elemanl� bir listenin 50. eleman�
	 * silinmek istenildi�i zaman, 50. eleman� siler, alttaki 50 diger eleman� da teker teker yukar�
	 * kayd�r�r, bu da LinkedList e g�re kaynak kullan�m�n� olduk�a art�r�r. Arraylist referans� bellekte tek bir obje
	 * g�sterir. Bu sebeple daha az yer kaplar, LinkedList bu konuda dezavantaj� vard�r, ��nk� her bir �gesi bir nesne dir.
	 * Bellekte her bir LinkedList eleman� i�in bir nesnelik yer a��l�r, bu sebeple ayn� say�da eleman i�in 
	 * Arraylist lere g�re daha �ok yer kaplar. LinkedList in performans konusunda avantaj� vard�r, ��nk�
	 * i�lem yaparken ilgili nesnenin g�sterdi�i referans la i�lem yapar yani sadece ilgili k�s�mdaki eleman�n �n� 
	 * yada arkas� ile i�lem yapar, Arraylistlerdeki gibi her eleman yer de�i�imi i�in b�t�n listeyi ta��maz. 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		LinkedList<String> gidilecekYerler = new LinkedList<>();
	/*	
		gidilecekYerler.add("Postane");		
		gidilecekYerler.add("Market");		
		gidilecekYerler.add("Okul");		
		gidilecekYerler.add("K�t�phane");
		gidilecekYerler.add("Gym");
		gidilecekYerler.add("Ev");
		
		listBastir(gidilecekYerler);
		System.out.println("-------------");
		
	//	gidilecekYerler.add(4, "Al��veri� merkezi");
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
	 * Harf �nceli�ine g�re s�ral� eleman ekler
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
				System.out.println("Listeniz bu eleman� zaten i�eriyor");
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
		
		  Iterator Javan�n "cursor" lar�ndan biridir. �ki nesnenin aras�nda durur,
		  "�uanki" obje diye bi �ey yoktur. �nceki veya sonraki vard�r.
		*/
		ListIterator<String> listIterator = linkedList.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
