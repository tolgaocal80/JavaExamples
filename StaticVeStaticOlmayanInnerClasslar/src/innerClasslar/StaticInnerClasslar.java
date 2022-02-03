package innerClasslar;

public class StaticInnerClasslar {
	
	public static class Alan{
		
		public void daireAlan(int yaricap) {
			System.out.println("Daire Alani : "+ Math.PI*yaricap*yaricap);
		}
		
	}
	
	public static class Cevre{
		public static void daireCevre(int yaricap) {
			System.out.println("Daire Cevre : "+ 2*Math.PI*yaricap);
		}
	}
	

}
