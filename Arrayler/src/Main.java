import java.util.Arrays;

public class Main {
	
	static int[] a = new int[10];
	
	static int[] b = {3000, 10, 50, 2000};
	
	static int[] c = new int[10]; 
	
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			c[i] = i * 2; 
			
		}
		
		/*
		for(int i = 0; i<10; i++) {
			System.out.println(c[i]);
		}
		*/
		
		
		System.out.println("Sýralanmamýs array");
		for(int i = 0; i<4; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("***************");
		Arrays.sort(b);
		
		System.out.println("Sýralanmýs array ? : ");
		
		for(int i = 0; i<4; i++) {
			System.out.println(b[i]);
		}
		
		
	}
	

}
 