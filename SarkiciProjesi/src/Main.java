import java.util.Scanner;

public class Main {
	
	private static Sarkicilar sarkicilar;
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("\t �ark�c� Uygulamas�na Ho�geldiniz...");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        while(!cikis) {
            System.out.println("Bir i�lem se�iniz:");
            islem = Integer.parseInt(scanner.nextLine()) ;
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan ��k�l�yor...");
                    break;
            }  
        }
	}
	
	
	public static void islemleri_bastir() {
        System.out.println("\t 0-��lemleri G�r�nt�le");
        System.out.println("\t 1-�ark�c�lar� G�r�nt�le");
        System.out.println("\t 2-�ark�c� Ekle");
        System.out.println("\t 3-�ark�c� G�ncelle");
        System.out.println("\t 4-�ark�c� Sil");
        System.out.println("\t 5-�ark�c� Ara");
        System.out.println("\t 6-Uygulamadan ��k");
    }
	
	
    public static void sarkici_goruntule() {
        sarkicilar.sarkiciBastir();
    }
    
    public static void sarkici_ekle(){
        System.out.println("Eklemek istedi�iniz �ark�c�n�n ismi:");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    
    public static void sarkici_guncelle() {  
        System.out.println("G�ncellemek istedi�iniz pozisyon(1,2,3...)");
        int pozisyon = Integer.parseInt(scanner.nextLine()) ;
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeni_isim, pozisyon - 1);
    }
    
    public static void sil() {   
        System.out.println("Silmek istedi�iniz pozisyon (1,2,3....)");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon-1);
    }
    
    
    public static void ara() {
        System.out.println("Aramak istedi�iniz �ark�c�:");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);  
    }
	
	
	
}

