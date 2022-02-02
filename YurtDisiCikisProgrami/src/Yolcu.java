import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vize;
	
	public Yolcu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yatýrdýðýnýz harç bedelini yazýnýz : ");
		
		this.harc = Integer.parseInt(scan.nextLine());
		
		System.out.print("\nSiyasi yasaðýnýz bulunuyor mu ? 'Evet' ya da 'Hayýr' ol"
				+ "arak giriniz. : " );
		
		if(scan.nextLine().toUpperCase().toString().equals("EVET")) {
			this.siyasiYasak = true;
		}else {
			this.siyasiYasak = false;
		}
		
		System.out.print("\nVizeniz bulunuyor mu? 'Evet' ya da 'Hayýr' olarak giriniz. : ");
		
		if(scan.nextLine().toUpperCase().toString().equals("EVET")) {
			this.vize = true;
		}else {
			this.vize = false;
		}
		
	}

	@Override
	public boolean yurtdisiHarci() {
		
		if(this.harc < 50) {
			System.out.println("Lütfen 50 TL domaliniz.");
			return false;
		}
		else {
			System.out.println("Geçiþ izni verildi.");
			return true;
		}
	}

	@Override
	public boolean siyasiYasak() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasaktan dolayý þuan yurtdýþýna resmi yollardan çýkamazsýnýz.");
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
			System.out.println("Vize iþlemleri onaylandý.");
			return true;
		}
		else {
			System.out.println("Vizeniz bulunmamaktadýr.");
			return false;
		}
	}
	

}
