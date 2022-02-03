
public class Main {

	
	/*
	 * Static method & attributes lere o sýnýftan bir nesne oluþturmadan doðrudan class adý ile ulaþým 
	 * saðlanýp kullanýlabilir. 
	 * 
	 * Main methodu neden static tir? 
	 * 
	 * Program ilk çalýþtýðý zaman hiçbir sýnýftan nesne oluþturulmaz, eðer nesne oluþturulmaz ise de bir sýnýfýn 
	 * methodlarýna ve alanlarýna eriþim saðlanamaz. main methodu static olmalýdýr çünkü program ilk çalýþtýðýnda
	 * ilk olarak main methodu çalýþýr, bu aþamada herhangi bir class tan nesne oluþturulmamýþtýr, static olduðundan dolayý nesne oluþturulmaya
	 * gerek kalmadan main methodu baþlatýlýr. 
	 * 
	 * Neden static bir method içinde statik olmayan bir field yazýldýðýnda hata verir? Yazýlamaz?
	 * 
	 * Static methodlar oluþtuðu zaman, henüz o sýnýftan nesne oluþturulmaz bu sebeple, attributes lerin atanabileceði bir
	 * nesne de olmayacaðýndan static olan bir method içine statik olmayan field ler verilemez.
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
