import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
		
	      /*
	    Queue Interface ve PriorityQueue Sınıfı

	    PriorityQueue normal Queue mantığı gibi davranmaz. Elemanlar öncelik sıralarına göre yüksek öncelik kazanıp
	    (
	    Integerlarda en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
	    Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, 
	    en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.

	    )

	    kuyrukta önlere geçer (Tıpkı Hastanedeki Acil Servisler Gibi). 

	    add veya offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
	    clear() metodu --------> Kuyruğu Temizler.
	    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
	    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
	    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
	    size()------> Kuyruğun içindeki eleman sayısını döner.
	        */
		
		Queue<Player> queue = new PriorityQueue<>();
		
		queue.offer(new Player("Tolga", 007));
		queue.offer(new Player("James", 6));
		queue.offer(new Player("Sagopa", 12));
		queue.offer(new Player("Bond",122));
		
		/*
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		*/
		
		while(!queue.isEmpty()) {
			System.out.println("eleman cıkarılıyor : "+ queue.poll());
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}






