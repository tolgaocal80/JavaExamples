
public class Problem {
	
	public static class Matematik{
		public static void daireAlan(int yaricap) {
			System.out.println("Dairenin alani : "+ (Math.PI*yaricap*yaricap));
		}
		public static void ucgenCevresi(int kenar1, int kenar2, int kenar3) {
			System.out.println("��genin �evresi : "+ (kenar1+kenar2+kenar3));
		}
	}
	
	
	
	public class Fizik{
		
		public void icCarpim(Vec vec1, Vec vec2) {
			int sonuc = (vec1.getI()*vec2.getI()) + 
					(vec1.getJ()*vec2.getJ()) +
					(vec1.getK()*vec2.getK());
			System.out.println(vec1.getIsim() + " ve " +  vec2.getIsim() + 
					" in i� �arp�m sonucu : " + sonuc);
		}
		
	}
	
	

}
