package innerClasslar;

import java.util.Scanner;

public class StatikOlmayanInnerClass {
	
	private double PI = Math.PI;
	
	public class Factorial{
		
		public void faktoriyel() {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Bir sayý giriniz : ");
			int sayi = Integer.parseInt(scanner.nextLine());
			int sonuc = 1;
			
			for(int i=1; i <= sayi; i++) {
				sonuc *= i;
				System.out.println("ara deðer : "+ sonuc);
			}
			System.out.println("Faktoriyel sonucu : "+ sonuc);
		}
		
	}
	
	
	
	
	
	
	public class Asal{
		
		public boolean asalMi(int sayi) {
			
			int count = 0;
			int i = 2;
			
			while(i < sayi) {
				if (sayi % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
	}
	
	
	
	public class Alan{
		
		public class DaireAlan{
			
			public void daireAlan(int yaricap) {
				System.out.println("Dairenin alani : "+ (int)(PI * yaricap * yaricap));
			}
			
		}
		
		public void kareAlan(int kenar) {
			System.out.println("Karenin alani : " + (kenar * kenar));
		}
		
	}
	
	
	
	
}



