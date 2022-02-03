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
				System.out.println("Kay�t yapt�r�ld�... �sim : " + getIsim() + " Numara : "+ getNumara());
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
	 * Abstract s�n�flara govdeli bir method eklenebildi�i i�in (haz�r kullan�labilen bir method)
	 * abstract s�n�flardan anonim inner class nesnesi olusturabilmek i�in static eri�im belirleyicisini
	 * kullanmal�y�z.
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
