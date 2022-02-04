
public class Main {
	
	public static void main(String[] args) {
		
		try {
			
			int a = 30/0;
			
			int[] b = {1,2,3,4,5,6,7};
			
			System.out.println(b[10]);
			
		}  catch (ArithmeticException e) {
			
			System.out.println("Hata oluþtu : " + e.getLocalizedMessage());
		}
		finally {
			System.out.println("Finally bloðu her zaman çalýþýr.");
		}
		
	}

}
