package throw_anahtar_kelimesi;

import java.util.Scanner;

public class ThrowKeyword {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yasinizi giriniz : ");
		int yas = scanner.nextInt();
		
		try {
			mekanKontrol(yas);
		} catch (ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	
	
	
	
	
	public static void mekanKontrol(int yas) {	
		if(yas < 18) {
			throw new ArithmeticException("18 ya��ndan k���kler mekana giri� yapamazlar.");
		}else {
			System.out.println("Mekana ho�geldiniz ...");
		}
	}
	
	
	

}
