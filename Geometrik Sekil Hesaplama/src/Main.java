import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String islemler = "Ýþlemler ....\n"
				+ "1. Kare Alan Hesapla\n"
				+ "2. Kare Cevre Hesapla\n"
				+ "3. Ücgen Alan Hesapla\n"
				+ "4. Daire Alan Hesapla\n"
				+ "Çýkýþ için q ' ya basýnýz.";
		
		while(true) {
			System.out.println(islemler);
			
			System.out.println("Hangi þeklin alanýný hesaplamak istiyorsunuz ? ");
			String sekilTuru = scanner.nextLine();
			
			Sekil sekil;
			
			if(sekilTuru.toUpperCase().equals("Q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			}
			
			else if(sekilTuru.equals("1")) {
				System.out.print("Karenin kenarý : ");
				int kenar = Integer.parseInt(scanner.nextLine());
				
				sekil = new Kare("Kare1", kenar);
				sekil.alanHesapla();
			}
			
			else if(sekilTuru.equals("2")) {
				System.out.println("Karenin kenarý : ");
				int kenar = Integer.parseInt(scanner.nextLine());
				
				sekil = new Kare("Kare1", kenar);
				
				((Kare) sekil).cevreHesapla();
			}
			
			else if(sekilTuru.equals("3")) {
				System.out.print("Kenar 1 : ");
				int kenar1 = Integer.parseInt(scanner.nextLine());
				System.out.print("Kenar 2 : ");
				int kenar2 = Integer.parseInt(scanner.nextLine());
				System.out.print("Kenar 3 : ");
				int kenar3 = Integer.parseInt(scanner.nextLine());
				
				sekil = new Ucgen("Ucgen1", kenar1, kenar2, kenar3);
				
				sekil.alanHesapla();
				
			}
			
			else if(sekilTuru.equals("4")) {
				System.out.println("Daire Yaricap : ");
				int yaricap = Integer.parseInt(scanner.nextLine());
				
				sekil = new Daire("Daire1", yaricap);
				sekil.alanHesapla();
			}
			else {
				System.out.println("Geçersiz iþlem");
			}
			
		}
		
	}

}
