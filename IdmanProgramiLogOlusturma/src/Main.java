import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Program�na Ho�geldiniz...");
        
        String idmanlar = "Ge�erli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(��nav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman olu�turun...");
        
        System.out.print("Burpee Say�s� : ") ;
        int burpee = Integer.parseInt(scanner.nextLine());
        System.out.print("Pushup Say�s� : ") ;
        int pushup = Integer.parseInt(scanner.nextLine());
        System.out.print("Situp Say�s� : ") ;
        int situp = Integer.parseInt(scanner.nextLine());
        System.out.print("Squat Say�s� : ") ;
        int squat = Integer.parseInt(scanner.nextLine());
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("�dman�n�z Ba�l�yor.....");
        
        int i =  1;
        
        try(FileWriter writer = new FileWriter("log.txt")) {
        	
        	writer.write("�dman Programi\n");
        	writer.write("Burpee sayisi : "+idman.getBurpee_sayisi() + '\n');
        	writer.write("Pushup sayisi : "+idman.getPushup_sayisi() + '\n');
        	writer.write("Situp sayisi : "+idman.getSitup_sayisi() + '\n');
        	
        	while(!idman.idmanBittiMi()) {
        		
        		System.out.println("Hareket T�r� (Burpee, Pushup, Situp, Squat)");
        		String tur = scanner.nextLine();
        		System.out.println("Bu hareketten ka� tane yapacaks�n�z ? :");
        		int sayi = Integer.parseInt(scanner.nextLine());
        		idman.hareketYap(tur, sayi);
        		
        		writer.write(i+ ". i�lem -----> Hareket : "+ tur + " Sayi : "+sayi+ '\n');
        		i++;        		
        	}
        	System.out.println("�dman bitti.");
        	
			
		} catch (Exception e) {
			
		}
        
        
		
	}
	
	
	
	
	
	
	
	
}
