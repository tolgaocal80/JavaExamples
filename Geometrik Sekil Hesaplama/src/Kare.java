
public class Kare extends Sekil{
	
	private int kenar;
	
	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}
	
	public void cevreHesapla() {
		System.out.println(getIsim() + " nin cevresi : " + 4 * kenar);
	}

	@Override
	void alanHesapla() {
		System.out.println(getIsim() + " alaný : "+ (kenar * kenar));
	}
	
}
