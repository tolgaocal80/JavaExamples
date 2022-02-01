package Ornek;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\nEsit Agirlik Puan Hesaplamas�\n");
		
		Sayisal sayisal = new Sayisal(45, 41, 30, 42, "Ali");
		Sayisal sayisal2 = new Sayisal(42, 42, 35, 36, "Veli");
		
		System.out.println(sayisal.getIsim() + " puan� : "+sayisal.puanHesapla() + 
				"\n"+ sayisal2.getIsim() + " puan� : "+ sayisal2.puanHesapla() +
				"\nEn yuksek puan : " + yuksekPuan(sayisal, sayisal2).puanHesapla()+
				"\n�sim : " + yuksekPuan(sayisal, sayisal2).getIsim()
				);
		
		System.out.println("\nEsit Agirlik Puan Hesaplamas�\n");
		
		EsitAgirlik esitAgirlik = new EsitAgirlik(46, 44, 46, 12, "Asl�");
		EsitAgirlik esitAgirlik2 = new EsitAgirlik(45, 47, 42, 21, "Ay�a");
		
		System.out.println(esitAgirlik.getIsim() + " puan� : "+esitAgirlik.puanHesapla() + 
				"\n"+ esitAgirlik2.getIsim() + " puan� : "+ esitAgirlik2.puanHesapla() +
				"\nEn yuksek puan : " + yuksekPuan(esitAgirlik, esitAgirlik2).puanHesapla()+
				"\n�sim : " + yuksekPuan(esitAgirlik, esitAgirlik2).getIsim()
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

