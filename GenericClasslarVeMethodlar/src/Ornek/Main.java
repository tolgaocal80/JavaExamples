package Ornek;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\nEsit Agirlik Puan Hesaplaması\n");
		
		Sayisal sayisal = new Sayisal(45, 41, 30, 42, "Ali");
		Sayisal sayisal2 = new Sayisal(42, 42, 35, 36, "Veli");
		
		System.out.println(sayisal.getIsim() + " puanı : "+sayisal.puanHesapla() + 
				"\n"+ sayisal2.getIsim() + " puanı : "+ sayisal2.puanHesapla() +
				"\nEn yuksek puan : " + yuksekPuan(sayisal, sayisal2).puanHesapla()+
				"\nİsim : " + yuksekPuan(sayisal, sayisal2).getIsim()
				);
		
		System.out.println("\nEsit Agirlik Puan Hesaplaması\n");
		
		EsitAgirlik esitAgirlik = new EsitAgirlik(46, 44, 46, 12, "Aslı");
		EsitAgirlik esitAgirlik2 = new EsitAgirlik(45, 47, 42, 21, "Ayça");
		
		System.out.println(esitAgirlik.getIsim() + " puanı : "+esitAgirlik.puanHesapla() + 
				"\n"+ esitAgirlik2.getIsim() + " puanı : "+ esitAgirlik2.puanHesapla() +
				"\nEn yuksek puan : " + yuksekPuan(esitAgirlik, esitAgirlik2).puanHesapla()+
				"\nİsim : " + yuksekPuan(esitAgirlik, esitAgirlik2).getIsim()
				);
		
	}
	
	static Sayisal yuksekPuan(Sayisal ilk, Sayisal ikinci) {
		if(ilk.puanHesapla() > ikinci.puanHesapla()) {
			return ilk;
		}else {
			return ikinci;
		}
	}
	
	
	static<E extends Aday> E yuksekPuan(E e1, E e2){
		
		if(e1.puanHesapla() > e2.puanHesapla())
			return e1;
		else
			return e2;
	}
	
	
	
	

}

