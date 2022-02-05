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
		System.out.println("Şarkıcı listesinde "+ sarkiciListesi.size()+
				" kadar şarkıcı vardır.");
		for(int i=0; i< sarkiciListesi.size(); i++) {
			System.out.println((i+1) + ".şarkıcı : "+ sarkiciListesi.get(i));
		}
	}
	
	public void sarkiciEkle(String isim) {
		sarkiciListesi.add(isim);
		System.out.println("Şarkıcı listesi güncellindi");
	}
	
	public void sarkiciGuncelle(String isim, int index) {
		sarkiciListesi.set(index, isim);
		System.out.println("Şarkıcı listesi güncellendi.");
	}
	
	public void sarkiciSil(int index) {
		String silinen = sarkiciListesi.get(index);
		sarkiciListesi.remove(index);
		System.out.println("Şarkıcı : "+ silinen + " listeden silindi.");
		System.out.println("Şarkıcı listesi güncellendi.");
	}
	
	
	public void sarkiciAra(String isim) {
		if(!sarkiciListesi.contains(isim)) {
			System.out.println("Aranan şarkıcı listede bulunmamaktadır.");
		}else {
			System.out.println("Aranan şarkıcı : "+isim+" bulundu. Listedeki konumu : "+(sarkiciListesi.indexOf(isim)+1));
		}
	}
	
	
	
	
	
}

