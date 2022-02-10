import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		String[] kanallar = {
			"Radyo viva","PowerTurk","Baba","Kral","Alem"};
	
		Radyo radyo = new Radyo(kanallar);
	
		/*
		 * can only iterate over an array or an instance of java.lang.iterable
		 */
		for (String radyo2 : radyo) {
			System.out.println(radyo2);
		}
		
		
		Iterator<String> iterator = radyo.iterator();
		
		
	}
	
	
	
	
}
