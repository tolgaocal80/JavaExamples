
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen Havalimanýna Hoþgeldiniz....");
        
        String sartlar = "Yurtdýþý Çýkýþ Kurallarý...\n\n"
                         +"Herhangi bir siyasi yasaðýnýzýn bulunmamasý gerekiyor...\n\n"
                         +"15 Tl harç bedelinizi tam olarak yatýrmanýz gerekiyor...\n\n"
                         +"Gideceðiniz ülkeye vizenizin bulunmasý gerekiyor...\n";
        String message = "Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor\n";
        
        
        while(true) {
        	
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(1000);
            
            if (yolcu.yurtdisiHarci() == false) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            
            Thread.sleep(1000);
            
            if (yolcu.siyasiYasak() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(1000);
            
            if (yolcu.vizeDurumu() == false){
            	
                System.out.println(message);
                continue;
            }
            
            System.out.println("Ýþlemleriniz Tamam ! Yurtdýþýna çýkabilirsiniz...");
            break;
            
        }
		
	}

}
