package throws_anahtar_kelimesi;

import java.io.IOException;

public class ThrowsKeyword {
	
	
	/*
	 * 
	 * Throws anahtar kelimesini fonksiyonun kendisinde yazmýþ olsakta, 
	 * bu fonksiyonu çaðýrdýðýmýz yerden try & catch blocklarý içerisinde yazýlmalý 
	 * yada buraya da "throws" anahtar kelimesini yazmalýyýz.
	 * Örneðin altta main fonksiyonunda ya "throws" anahtar kelimesini yazmalýyýz ya da
	 * try & catch bloklarý kullanarak yakalamalýyýz.
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
	 * Ioexception, SQLexception gibi derleme öncesinde check edilen ve kullanýcýya söylenen
	 * hatalarý fýrlatabilecek fonksiyonlar yazýyorsak, fonksiyonu tanýmlarken,
	 * açýklamalarýna "throws XXexception" þekilnde o hatayý fýrlatacaðýný bildiði için 
	 * uyarýyor.
	 */
	
	/*
	 * Unchecked exceptionlar da bu uyarý yý vermez yani "throws" anahtar kelimesi kullanmamýzý 
	 * istemez, istersek ekleyebiliriz.
	 * 
	 */
	public static void dosyaKontrol(int yas) throws IOException{
		if(yas<20) {
			throw new IOException();
		}
		else {
			System.out.println("Mekana hoþgeldiniz...");
		}
	}
	
	
	 
	
	
	

}
