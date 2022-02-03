package innerClasslar;

public class AnonimInnerClasslar {
	
	public static void main(String[] args) {
		
		IOgrenci ogrenci = new IOgrenci() {
			
			@Override
			public void derseGir() {
				System.out.println("Derse giriyorum");
			}
			@Override
			public void dersCalis() {
				System.out.println("Ders calisiyorum");
			}
		};
		
		ogrenci.dersCalis();
		ogrenci.derseGir();
		
		System.out.println("--------------");
		
		
		AOgrenci ogrenci2 = new AOgrenci("Tolga", 15) {
			
			@Override
			void kayitYaptir() {
				System.out.println("Kayýt yaptýrýldý... Ýsim : " + getIsim() + " Numara : "+ getNumara());
			}
		};
		
		
		ogrenci2.kayitYaptir();
		ogrenci2.selamla();
		
		
	}
	
	
	
	
	public interface IOgrenci{
		
		void dersCalis();
		void derseGir();
		
	}
	
	
	
	/*
	 * Abstract sýnýflara govdeli bir method eklenebildiði için (hazýr kullanýlabilen bir method)
	 * abstract sýnýflardan anonim inner class nesnesi olusturabilmek için static eriþim belirleyicisini
	 * kullanmalýyýz.
	 * 
	 */
	public static abstract class AOgrenci{
		
		private String isim;
		private int numara;
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public int getNumara() {
			return numara;
		}
		public void setNumara(int numara) {
			this.numara = numara;
		}

		public AOgrenci(String isim, int numara) {
			this.isim = isim;
			this.numara = numara;
		}

		abstract void kayitYaptir();
		
		public void selamla() {
			System.out.println("selamlar...");
		}
		
	}
	
	
	
	

}
