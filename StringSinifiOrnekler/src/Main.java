
public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Eger String a = "sdfsdf" þeklinde bir tanýmlama
		 * yaparsak burada string sýnýfýndan primitive bir deðiþken olusmus olur
		 * yani string olduðu için nesne deðiþkeni olduðunu sanma, new anahtar kelimesi
		 * ile nesne oluþturulmadý, bunlar da primitive olacaklar. Eger bunlarý
		 * "==" operatörü ile karþýlastýrýrsak bunlar eþit olarak görünecek, çünkü deðerleri ayný
		 * yani obje karþýlaþtýrýlmasý yapýlmadý. Belleðin stack kýsmýnda yer alacaklar (ikisi için ayrý bir yer, obje ayrýlmadý.)
		 * Deðerlerinin ayný olmasý ayný referansý göstermeleri için yeterli olacak. 
		 */
		String a = "Tolga";
		String b = "Tolga";
		
		if(a == b) {
			System.out.println("Eþitler");
		}
		
		System.out.println("----------------");
		
		
		/*
		 * Burada ise new String diyerek ikisi için de ayrý birer nesne olusturduðumuz için bu
		 * referanslar (c ve d) bellekte farklý yeri gösterecekler dolayýsýyla bu iki referans
		 * "deðerleri ayný olsa bile" eþit olmayacaklar yani bellekte ayný yeri göstermeyecekler.
		 */
		String c = new String("Tolga");
		String d = new String("Tolga");
			
		if(d == c) {
			System.out.println("Eþitler.");
		}else {
			System.out.println("Eþit Deðiller.");
		}
		
		/*
		 * Bunlarýn içeriðini kontrol etmek istersek equals methodu ile karþýlastýrmalýyýz.
		 */
		
	}
	
}
