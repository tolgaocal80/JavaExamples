
public class Main {

	
	/*
	 * Static method & attributes lere o s�n�ftan bir nesne olu�turmadan do�rudan class ad� ile ula��m 
	 * sa�lan�p kullan�labilir. 
	 * 
	 * Main methodu neden static tir? 
	 * 
	 * Program ilk �al��t��� zaman hi�bir s�n�ftan nesne olu�turulmaz, e�er nesne olu�turulmaz ise de bir s�n�f�n 
	 * methodlar�na ve alanlar�na eri�im sa�lanamaz. main methodu static olmal�d�r ��nk� program ilk �al��t���nda
	 * ilk olarak main methodu �al���r, bu a�amada herhangi bir class tan nesne olu�turulmam��t�r, static oldu�undan dolay� nesne olu�turulmaya
	 * gerek kalmadan main methodu ba�lat�l�r. 
	 * 
	 * Neden static bir method i�inde statik olmayan bir field yaz�ld���nda hata verir? Yaz�lamaz?
	 * 
	 * Static methodlar olu�tu�u zaman, hen�z o s�n�ftan nesne olu�turulmaz bu sebeple, attributes lerin atanabilece�i bir
	 * nesne de olmayaca��ndan static olan bir method i�ine statik olmayan field ler verilemez.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Seyirci seyirci = new Seyirci("James Bond");
		
		Seyirci seyirci2 = new Seyirci("Tolga Ocal");
		
		seyirci.oyunSeyret();
		seyirci2.oyunSeyret();
		
		System.out.println("Seyirci sayisi : "+ seyirci.count);
		System.out.println("Seyirci sayisi : "+ seyirci2.count);
		
		System.out.println("Seyirci sayisi : "+ Seyirci.count);
		
		
	}

}
