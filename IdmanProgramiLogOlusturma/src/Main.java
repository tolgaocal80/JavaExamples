import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programýna Hoþgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Þýnav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluþturun...");
        
        System.out.print("Burpee Sayýsý : ") ;
        int burpee = Integer.parseInt(scanner.nextLine());
        System.out.print("Pushup Sayýsý : ") ;
        int pushup = Integer.parseInt(scanner.nextLine());
        System.out.print("Situp Sayýsý : ") ;
        int situp = Integer.parseInt(scanner.nextLine());
        System.out.print("Squat Sayýsý : ") ;
        int squat = Integer.parseInt(scanner.nextLine());
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("Ýdmanýnýz Baþlýyor.....");
        
        int i =  1;
        
        try(FileWriter writer = new FileWriter("log.txt")) {
        	
        	writer.write("Ýdman Programi\n");
        	writer.write("Burpee sayisi : "+idman.getBurpee_sayisi() + '\n');
        	writer.write("Pushup sayisi : "+idman.getPushup_sayisi() + '\n');
        	writer.write("Situp sayisi : "+idman.getSitup_sayisi() + '\n');
        	
        	while(!idman.idmanBittiMi()) {
        		
        		System.out.println("Hareket Türü (Burpee, Pushup, Situp, Squat)");
        		String tur = scanner.nextLine();
        		System.out.println("Bu hareketten kaç tane yapacaksýnýz ? :");
        		int sayi = Integer.parseInt(scanner.nextLine());
        		idman.hareketYap(tur, sayi);
        		
        		writer.write(i+ ". iþlem -----> Hareket : "+ tur + " Sayi : "+sayi+ '\n');
        		i++;        		
        	}
        	System.out.println("Ýdman bitti.");
        	
			
		} catch (Exception e) {
			
		}
        
        
		
	}
	
	
	
	
	
	
	
	
}
