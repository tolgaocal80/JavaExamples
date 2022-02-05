import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> sehirler = new LinkedList<String>();
		sehirler.add("Ankara");
		sehirler.add("Eskiþehir");
		sehirler.add("Afyon");
		sehirler.add("Kýrýkkale");
		sehirler.add("Konya");
		sehirler.add("Erzurum");
	}
	
	public static void islemleriBastir(){
		System.out.println("0 - Ýþlemleri Görüntüle..");
	    System.out.println("1 - Bir sonraki þehre git...");
	    System.out.println("2 - Bir önceki þehre git...");
	    System.out.println("3 - Uygulamadan Çýk.");  
	}
	
	public static void sehirTurla(LinkedList<String> list) {
		
		ListIterator<String> listIterator = list.listIterator();
		
		int islem;
		
		islemleriBastir();
		
		Scanner scanner = new Scanner(System.in);
        
        if (!listIterator.hasNext()) {
            System.out.println("Herhangi bir þehir bulunmuyor...");
        }
        
        
        boolean cikis = false;
        
        boolean ileri = true;
        
        while (!cikis) {
            System.out.println("Bir iþlem seçiniz:");
            
            islem = Integer.parseInt(scanner.nextLine());
            
            switch(islem) {
            
                case 0:
                    islemleriBastir();
                    break;
                    
                case 1:
                    if (!ileri) {
                        if (listIterator.hasNext()) { 
                        	listIterator.next();
                        }
                        ileri = true;
                    }
                    if (listIterator.hasNext())
                        System.out.println("Þehre gidiliyor : " + listIterator.next()); 
                    else {
                        System.out.println("Gidilecek Þehir Kalmadý...");
                        ileri = true;
                    }
                    break;
                    
                    
                case 2:
                    if (ileri){
                        if (listIterator.hasPrevious()) {
                        	listIterator.previous();
                        }
                        ileri = false; 
                    }
                    if (listIterator.hasPrevious())
                        System.out.println("Þehre Gidiliyor : " + listIterator.previous());
                    else {
                        System.out.println("Þehir Turu Baþladý....");
                    }
                    break;
                    
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çýkýlýyor...");
                    break;
                    
            }
        }
        scanner.close();
	}
	
	
	
	
}
