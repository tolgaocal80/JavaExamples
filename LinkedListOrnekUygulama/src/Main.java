import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> sehirler = new LinkedList<String>();
		sehirler.add("Ankara");
		sehirler.add("Eski�ehir");
		sehirler.add("Afyon");
		sehirler.add("K�r�kkale");
		sehirler.add("Konya");
		sehirler.add("Erzurum");
	}
	
	public static void islemleriBastir(){
		System.out.println("0 - ��lemleri G�r�nt�le..");
	    System.out.println("1 - Bir sonraki �ehre git...");
	    System.out.println("2 - Bir �nceki �ehre git...");
	    System.out.println("3 - Uygulamadan ��k.");  
	}
	
	public static void sehirTurla(LinkedList<String> list) {
		
		ListIterator<String> listIterator = list.listIterator();
		
		int islem;
		
		islemleriBastir();
		
		Scanner scanner = new Scanner(System.in);
        
        if (!listIterator.hasNext()) {
            System.out.println("Herhangi bir �ehir bulunmuyor...");
        }
        
        
        boolean cikis = false;
        
        boolean ileri = true;
        
        while (!cikis) {
            System.out.println("Bir i�lem se�iniz:");
            
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
                        System.out.println("�ehre gidiliyor : " + listIterator.next()); 
                    else {
                        System.out.println("Gidilecek �ehir Kalmad�...");
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
                        System.out.println("�ehre Gidiliyor : " + listIterator.previous());
                    else {
                        System.out.println("�ehir Turu Ba�lad�....");
                    }
                    break;
                    
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan ��k�l�yor...");
                    break;
                    
            }
        }
        scanner.close();
	}
	
	
	
	
}
