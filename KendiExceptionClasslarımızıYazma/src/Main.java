
public class Main {
	
	public static void main(String[] args) {
		
		
		try {
			mekanKontrol(4);	
		} catch (Exception e) {
			System.out.println("Hata olu�tu : ");
			System.out.println(e);
		}
		
	}
	
	static void mekanKontrol(int yas) {
		if(yas < 18) {
			throw new InvalidAgeException("18 ya��ndan k���kler giremez.");
		}else {
			System.out.println("Mekana hosgeldiniz.");
		}
	}

}
