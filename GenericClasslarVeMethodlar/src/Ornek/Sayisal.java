package Ornek;

public class Sayisal extends Aday{

	public Sayisal(int turkce, int mat, int edeb, int fizik, String isim) {
		super(turkce, mat, edeb, fizik, isim);
	}
	
	

	@Override
	int puanHesapla() {
		return getTurkce()*5 + getMat()*5 + getFizik()*4 + getEdeb()*2;
	}
	
}
