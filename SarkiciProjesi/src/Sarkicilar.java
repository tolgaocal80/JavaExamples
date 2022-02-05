import java.util.ArrayList;

public class Sarkicilar {
	
	private ArrayList<String> sarkiciListesi = new ArrayList<>();
	
	public ArrayList<String> getSarkiciListesi() {
		return sarkiciListesi;
	}
	
	public void setSarkiciListesi(ArrayList<String> sarkiciListesi) {
		this.sarkiciListesi = sarkiciListesi;
	}
	
	public void sarkiciBastir() {
		System.out.println("�ark�c� listesinde "+ sarkiciListesi.size()+
				" kadar �ark�c� vard�r.");
		for(int i=0; i< sarkiciListesi.size(); i++) {
			System.out.println((i+1) + ".�ark�c� : "+ sarkiciListesi.get(i));
		}
	}
	
	public void sarkiciEkle(String isim) {
		sarkiciListesi.add(isim);
		System.out.println("�ark�c� listesi g�ncellindi");
	}
	
	public void sarkiciGuncelle(String isim, int index) {
		sarkiciListesi.set(index, isim);
		System.out.println("�ark�c� listesi g�ncellendi.");
	}
	
	public void sarkiciSil(int index) {
		String silinen = sarkiciListesi.get(index);
		sarkiciListesi.remove(index);
		System.out.println("�ark�c� : "+ silinen + " listeden silindi.");
		System.out.println("�ark�c� listesi g�ncellendi.");
	}
	
	
	public void sarkiciAra(String isim) {
		if(!sarkiciListesi.contains(isim)) {
			System.out.println("Aranan �ark�c� listede bulunmamaktad�r.");
		}else {
			System.out.println("Aranan �ark�c� : "+isim+" bulundu. Listedeki konumu : "+(sarkiciListesi.indexOf(isim)+1));
		}
	}
	
	
	
	
	
}

