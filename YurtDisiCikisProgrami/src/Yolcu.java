import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vize;
	
	public Yolcu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yat�rd���n�z har� bedelini yaz�n�z : ");
		
		this.harc = Integer.parseInt(scan.nextLine());
		
		System.out.print("\nSiyasi yasa��n�z bulunuyor mu ? 'Evet' ya da 'Hay�r' ol"
				+ "arak giriniz. : " );
		
		if(scan.nextLine().toUpperCase().toString().equals("EVET")) {
			this.siyasiYasak = true;
		}else {
			this.siyasiYasak = false;
		}
		
		System.out.print("\nVizeniz bulunuyor mu? 'Evet' ya da 'Hay�r' olarak giriniz. : ");
		
		if(scan.nextLine().toUpperCase().toString().equals("EVET")) {
			this.vize = true;
		}else {
			this.vize = false;
		}
		
	}

	@Override
	public boolean yurtdisiHarci() {
		
		if(this.harc < 50) {
			System.out.println("L�tfen 50 TL domaliniz.");
			return false;
		}
		else {
			System.out.println("Ge�i� izni verildi.");
			return true;
		}
	}

	@Override
	public boolean siyasiYasak() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasaktan dolay� �uan yurtd���na resmi yollardan ��kamazs�n�z.");
			return false;
		}
		else {
			System.out.println("Siyasi engeliniz bulunmuyor.");
			return true;
		}
	}

	@Override
	public boolean vizeDurumu() {
		if(this.vize == true) {
			System.out.println("Vize i�lemleri onayland�.");
			return true;
		}
		else {
			System.out.println("Vizeniz bulunmamaktad�r.");
			return false;
		}
	}
	

}
