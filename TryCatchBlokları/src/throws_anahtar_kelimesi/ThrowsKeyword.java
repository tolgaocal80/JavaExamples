package throws_anahtar_kelimesi;

import java.io.IOException;

public class ThrowsKeyword {
	
	
	/*
	 * 
	 * Throws anahtar kelimesini fonksiyonun kendisinde yazm�� olsakta, 
	 * bu fonksiyonu �a��rd���m�z yerden try & catch blocklar� i�erisinde yaz�lmal� 
	 * yada buraya da "throws" anahtar kelimesini yazmal�y�z.
	 * �rne�in altta main fonksiyonunda ya "throws" anahtar kelimesini yazmal�y�z ya da
	 * try & catch bloklar� kullanarak yakalamal�y�z.
	 */
	
	public static void main(String[] args) {
		try {
			dosyaKontrol(12);
		} catch (IOException e) {
			
			System.out.println("Error found : "+e.getLocalizedMessage() +
					" caused by : " + e.getCause());
		}
	}
	
	
	/*
	 * Ioexception, SQLexception gibi derleme �ncesinde check edilen ve kullan�c�ya s�ylenen
	 * hatalar� f�rlatabilecek fonksiyonlar yaz�yorsak, fonksiyonu tan�mlarken,
	 * a��klamalar�na "throws XXexception" �ekilnde o hatay� f�rlataca��n� bildi�i i�in 
	 * uyar�yor.
	 */
	
	/*
	 * Unchecked exceptionlar da bu uyar� y� vermez yani "throws" anahtar kelimesi kullanmam�z� 
	 * istemez, istersek ekleyebiliriz.
	 * 
	 */
	public static void dosyaKontrol(int yas) throws IOException{
		if(yas<20) {
			throw new IOException();
		}
		else {
			System.out.println("Mekana ho�geldiniz...");
		}
	}
	
	
	 
	
	
	

}
