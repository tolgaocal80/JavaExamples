import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static Kart[][] kartlar = new Kart[4][4];
	static boolean cikisYapildi = false;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        System.out.println("Hosgeldiniz...");
        System.out.println("Kayıtlı oyunlar aranıyor...");
        
        if(OyunKayit.kayittanAl() == null) {
        	System.out.println("Kayıtlı oyun bulunamadı...");
        }else {
        	System.out.println("Kayıtlı oyun bulundu, kayıttan yüklemek ister misiniz ? Evet için 'E'ye hayır için 'H'ye basınız.");
        	if(scanner.nextLine().toUpperCase().equals("E")) {
				kartlar = OyunKayit.kayittanAl();
			}else{
				System.out.println("Yeni oyun açılıyor...");
			}
        }
        
        
        while(true) {
        	
        	if(oyunBittiMi() || cikisYapildi) {
        		if(oyunBittiMi()) {
        			System.out.println("TEBRIKLER BUTUN TABLOYU TAMAMLADINIZ...");
        		}
        		break;
        	}
        	try {
        		oyunTahtasi();
        		
        		tahminEt();
        		
        	}catch (Exception e) {
        		if(!cikisYapildi) {
        			System.out.println("Hatali giris yaptiniz. Yeniden deneyiniz.");
	        		System.out.println(e.getLocalizedMessage());
	        		for(int i = 0; i< kartlar.length; i++) {
	        			for(int j = 0; j< kartlar.length; j++) {
	            			if(kartlar[i][j].isVisible()) {
	            				kartlar[i][j].setTahmin(false);
	            			}
	            		}
	        		}
        		}
        		
			}
        }
        
        
		
	}
	
	
	public static void oyunTahtasi() {
		for(int i =0; i<4 ; i++) {
			System.out.println("____________________");
			for(int j=0; j<4; j++) {
				if(kartlar[i][j].isTahmin()) {
					System.out.print(" |"+ kartlar[i][j].getDeger() + "| ");
				}
				else {
					System.out.print(" | | ");
				}
			}
			System.out.println();
		}
		System.out.println("____________________");
	}

	public static void tahminEt() {
		
		Scanner scanner = new Scanner(System.in);
		int i1 = -1;
		int j1 = -1;
		int i2 = -1;
		int j2 = -1;
		System.out.println("Cikis icin Q'ya basiniz.");
		System.out.print("Birinci tahmiminizi (i j) seklinde giriniz : ");
		
		
		try {
			
			String a = scanner.next();
			
			if(a.toUpperCase().equals("Q")) {
				
				scanner.nextLine();
				System.out.println("Oyunu kaydetmek ister misiniz? Evet icin 'E'ye hayir icin 'H'ye basiniz.");
				
				String yanit = scanner.nextLine();
				
				if(yanit.toUpperCase().equals("E")) {
					OyunKayit.oyunKaydet(kartlar);
					System.out.println("Oyun kayit edildi, cikis yapiliyor...");
					cikisYapildi = true;
				}else{
					System.out.println("Cikis yapiliyor...");
					cikisYapildi = true;
				}
			}
			
			i1 = Integer.parseInt(a);	 
			j1= scanner.nextInt();
				 
		}catch (InputMismatchException e) {
			System.out.println(e.getLocalizedMessage());
		}
	
		if(!kartlar[i1][j1].isVisible()) {
			System.out.println("Bu kartlari zaten bildiniz. Baska bir deneme yapiniz.");
		}
		else {
			kartlar[i1][j1].setTahmin(true);
			oyunTahtasi();
			System.out.print("Ikinci tahminizi giriniz :  ");
			try {
				i2 = scanner.nextInt();
				j2= scanner.nextInt();
				
			} catch (Exception e) {
				kartlar[i1][j1].setTahmin(false);
				System.out.println(e.getLocalizedMessage());
			}
			while(i1 == i2 && j1 == j2) {
				oyunTahtasi();
				System.out.println("Ilk sectiginiz karttan farkli bir secim yapiniz");
				System.out.print("Ikinci tahminizi giriniz : ");
				try {
					
					i2 = scanner.nextInt();
					j2= scanner.nextInt();
				} catch (Exception e) {
					kartlar[i1][j1].setTahmin(false);
					System.out.println(e.getLocalizedMessage());
				}
				
			}
			
			if(!kartlar[i2][j2].isVisible()) {
				System.out.println("Bu kartlari zaten bildiniz. Baska bir deneme yapiniz.");
				kartlar[i1][j1].setTahmin(false);
				}
			else {
				if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
					kartlar[i2][j2].setTahmin(true);
					System.out.println("Tebrikler! Dogru Bildiniz.");
					kartlar[i2][j2].setVisible(false);
					kartlar[i1][j1].setVisible(false);
					}
				else {
					System.out.println("Yeniden Deneyin!");
					kartlar[i1][j1].setTahmin(false);
					}
				}
				
			}
		}
	
	
    public static boolean oyunBittiMi() {
        for (int i =  0 ; i < 4; i++){
            for (int j = 0 ; j < 4 ; j++) {
                if (kartlar[i][j].isVisible() == true) {
                    return false;  
                }
            }
        }
        return true;   
    }
	
	
	
}



