
public class Kart {
	
	private char deger;
	private boolean tahmin = false;
	private boolean isVisible = true;
	
	
	
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public Kart(char deger) {
		this.deger = deger;
	}
	public char getDeger() {
		return deger;
	}
	public void setDeger(char deger) {
		this.deger = deger;
	}
	public boolean isTahmin() {
		return tahmin;
	}
	public void setTahmin(boolean tahmin) {
		this.tahmin = tahmin;
	}
	

}
