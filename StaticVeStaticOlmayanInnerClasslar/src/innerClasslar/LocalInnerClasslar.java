package innerClasslar;

public class LocalInnerClasslar {
	
	
	
	/*
	 * Method un i�ine yaz�lan s�n�flar local class olarak tan�mlan�r.
	 * bu local s�n�flar a i�erisinde bulundu�u method harici bir yerden erisim sa�lanamaz
	 * Method la beraber ba�lar, method bitince biter, bellekten silinir. 
	 */
	
	
	
	public static void main(String[] args) {
		
		alanHesaplama();
	}
	
	
	
	
	
	public static void alanHesaplama() {
		
		class Alan{
			
			public void daireAlan(int yaricap) {
				System.out.println("Dairenin alani : "+ (yaricap * yaricap * Math.PI));
			}
			
		}
		
		Alan alan = new Alan();
		alan.daireAlan(10);
		
		Alan alan2 = new Alan();
		alan2.daireAlan(3);
	}
	
	
	

}
