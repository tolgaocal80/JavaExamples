import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		zamanHesapla("LinkedList", linkedList);
		zamanHesapla("ArrayList", arrayList);
		
	}
	
	/*
	 * ARRAYLİST 
	 * 
	 * Arraylist lerle islem yaparken unutmamak gereken şeyler;
	 * bir arraylist belli bir index e eleman eklerken örneğin sonuna eleman eklerken 
	 * sıkıntı yok, en sona hızlı bi şekilde elemanı ekler, ancak örneğin her seferinde en başa ya da ortada bir yere eleman 
	 * eklemek gerekirse, "bütün" elemanları bir aşağı ya da yukarı kaydırmaya çalışarak o elemanı ekler.
	 * Eğer en başa eleman ekleniyorsa, listede örneğin 1m eleman varsa hepsini bir alta kaydırır, en üstte boş bi yer açar, 
	 * yeni elemanı oraya ekler. Anlaşıldığı üzere eger sona ekleme yapılacaksa cok hızlıdır, çünkü direkt olarak sona ekler.
	 * Ama ortalarda işlem yapılacaksa, ve eleman sayısı fazlaysa çok yüksek derecede performans kaybı yaşar, hatta eklemeyebilir.
	 * Arraylist in olayı basittir.
	 * - Sonda işlem yapılacaksa direkt yap. (çok hızlı)
	 * - Ortalarda işlem yapılacaksa o indexe gel, diğer tüm elemanları bir alta kaydır, ekle. (çok yavaş)
	 * 
	 * LİNKEDLİST
	 * 
	 * Linkedlist lerle ise işlem nereye yapılırsa yapılsın, referansla işlem yapılır. işlem yapılacak index e gelinir, aradaki referans
	 * yerine istenen eleman eklenir(islem yapılır). Sona da eklense başa da eklense olay aynı, referanslar üzerinden işlem yapar. Obje ekler cıkarır.
	 * Eleman sayısı fazla olduğu zaman ve aradaki elemanlardan birine işlem yapılacağı zaman arraylist e göre cok hızlı bir
	 * sekilde islem yapar.
	 * Genel olarak arraylist ler yerine kullanılabilir.
	 */
	
	
	public static void zamanHesapla(String veriTuru, List<Integer> list) {
		
		long baslangic;
		long bitis;
		
		baslangic = System.currentTimeMillis();
		
		// List in sonuna deger ekleme
		for(int i =0; i< 1_000_00 ; i++) {
			list.add(0,i);
		}  
		bitis = System.currentTimeMillis();
		System.out.println(veriTuru +" ekleme süresi : "+ (bitis-baslangic)+"ms");
	}
	
	
	
	
	
}
