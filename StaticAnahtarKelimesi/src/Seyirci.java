
public class Seyirci {
	
	private String isim;
	
	public static int count = 0;

	public Seyirci(String isim) {
		super();
		this.isim = isim;
		count++;
		System.out.println("Yeni seyirci oluþturuldu.");
		System.out.println("Seyirci sayisi : "+ count);
	}
	
	public void oyunSeyret() {
		System.out.println(this.isim + " oyun seyrediyor.");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	
}
