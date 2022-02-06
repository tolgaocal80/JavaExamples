import java.io.Serializable;

public class Ogrenci implements Serializable{
	
	private String isim;
	private int id;
	private String bolum;
	
	/*
	 * STATİK ALANLAR CLASS A ÖZGÜ OLDUĞUNU DÜŞÜNEREK JAVA 
	 * TARAFINDAN SERİLEŞTİRİLMEZ.
	 * STATİK DEĞİŞKENLER OBJEYE ÖZGÜ DEĞİLDİR, BU SEBEPLE SERİLEŞTİRİLMEYE GEREK YOKTUR
	 * ŞEKLİNDE YORUMLANIR JAVA TARAFINDAN	 * 
	 */
	private static int ogrenciSayisi = 0;
	
	public static int getOgrenciSayisi() {
		return ogrenciSayisi;
	}

	public static void setOgrenciSayisi(int ogrenciSayisi) {
		Ogrenci.ogrenciSayisi = ogrenciSayisi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public Ogrenci(String isim, int id, String bolum) {
		super();
		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		String bilgiler = "Ogrenci ismi : "+isim +
				"\nÖğrenci numarası : "+id+ 
				"\nÖğrenci bölümü : "+bolum;
		return bilgiler;
	}
	
	
	
}
