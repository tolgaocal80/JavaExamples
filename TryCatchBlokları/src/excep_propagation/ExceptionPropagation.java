package excep_propagation;

public class ExceptionPropagation {
	
	public static void main(String[] args) {
		birinci();
	}
	
	
	static void birinci() {
		System.out.println("Birinci fonksiyon");
		try {
			ikinci();
		} catch (Exception e) {
			System.out.println("Hata");
		}
	}
	
	static void ikinci() {
		System.out.println("Ikýncý fonksiyon");
		ucuncu();
	}
	
	static void ucuncu() {
		int a = 13 / 0;
		System.out.println("Ucuncu fonksiyon");
	}
	

}
