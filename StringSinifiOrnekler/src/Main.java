
public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Eger String a = "sdfsdf" �eklinde bir tan�mlama
		 * yaparsak burada string s�n�f�ndan primitive bir de�i�ken olusmus olur
		 * yani string oldu�u i�in nesne de�i�keni oldu�unu sanma, new anahtar kelimesi
		 * ile nesne olu�turulmad�, bunlar da primitive olacaklar. Eger bunlar�
		 * "==" operat�r� ile kar��last�r�rsak bunlar e�it olarak g�r�necek, ��nk� de�erleri ayn�
		 * yani obje kar��la�t�r�lmas� yap�lmad�. Belle�in stack k�sm�nda yer alacaklar (ikisi i�in ayr� bir yer, obje ayr�lmad�.)
		 * De�erlerinin ayn� olmas� ayn� referans� g�stermeleri i�in yeterli olacak. 
		 */
		String a = "Tolga";
		String b = "Tolga";
		
		if(a == b) {
			System.out.println("E�itler");
		}
		
		System.out.println("----------------");
		
		
		/*
		 * Burada ise new String diyerek ikisi i�in de ayr� birer nesne olusturdu�umuz i�in bu
		 * referanslar (c ve d) bellekte farkl� yeri g�sterecekler dolay�s�yla bu iki referans
		 * "de�erleri ayn� olsa bile" e�it olmayacaklar yani bellekte ayn� yeri g�stermeyecekler.
		 */
		String c = new String("Tolga");
		String d = new String("Tolga");
			
		if(d == c) {
			System.out.println("E�itler.");
		}else {
			System.out.println("E�it De�iller.");
		}
		
		/*
		 * Bunlar�n i�eri�ini kontrol etmek istersek equals methodu ile kar��last�rmal�y�z.
		 */
		
	}
	
}
