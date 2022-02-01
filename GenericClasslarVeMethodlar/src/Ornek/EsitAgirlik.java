package Ornek;

public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turkce, int mat, int edeb, int fizik, String isim) {
		super(turkce, mat, edeb, fizik, isim);
	}

	@Override
	int puanHesapla() {
		return getEdeb()*5 + getFizik()*2 + getMat()*5+ getTurkce()*4;
	}

}
