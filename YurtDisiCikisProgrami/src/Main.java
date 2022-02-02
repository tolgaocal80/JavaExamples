
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha G�k�en Havaliman�na Ho�geldiniz....");
        
        String sartlar = "Yurtd��� ��k�� Kurallar�...\n\n"
                         +"Herhangi bir siyasi yasa��n�z�n bulunmamas� gerekiyor...\n\n"
                         +"15 Tl har� bedelinizi tam olarak yat�rman�z gerekiyor...\n\n"
                         +"Gidece�iniz �lkeye vizenizin bulunmas� gerekiyor...\n";
        String message = "Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor\n";
        
        
        while(true) {
        	
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Har� Bedeli Kontrol Ediliyor...");
            
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
            
            System.out.println("��lemleriniz Tamam ! Yurtd���na ��kabilirsiniz...");
            break;
            
        }
		
	}

}
