package Ornek;

public abstract class Aday {
	
	private int turkce;
	private int mat;
	private int edeb;
	private int fizik;
	private String isim;
	
	abstract int puanHesapla();
	
	public Aday(int turkce, int mat, int edeb, int fizik, String isim) {
		super();
		this.turkce = turkce;
		this.mat = mat;
		this.edeb = edeb;
		this.fizik = fizik;
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public int getTurkce() {
		return turkce;
	}
	public void setTurkce(int turkce) {
		this.turkce = turkce;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEdeb() {
		return edeb;
	}
	public void setEdeb(int edeb) {
		this.edeb = edeb;
	}
	public int getFizik() {
		return fizik;
	}
	public void setFizik(int fizik) {
		this.fizik = fizik;
	}
	
	
}
