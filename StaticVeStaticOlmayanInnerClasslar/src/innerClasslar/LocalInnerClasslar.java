package innerClasslar;

public class LocalInnerClasslar {
	
	
	
	/*
	 * Method un içine yazýlan sýnýflar local class olarak tanýmlanýr.
	 * bu local sýnýflar a içerisinde bulunduðu method harici bir yerden erisim saðlanamaz
	 * Method la beraber baþlar, method bitince biter, bellekten silinir. 
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
