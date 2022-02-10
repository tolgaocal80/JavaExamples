import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String>{
	
	
	private ArrayList<String> kanalListesi = new ArrayList<>();

	public Radyo(String[] kanallar) {
		for (String string : kanallar) {
			this.kanalListesi.add(string);
		}
	}
	
	
	@Override
	public Iterator<String> iterator() {
		return new RadyoIterator();
	}
	
	
	public class RadyoIterator implements Iterator<String>{
		private int index = 0;		
		@Override
		public boolean hasNext() {
			if(index < kanalListesi.size()) {
				return true;
			}
			System.out.println("hasNext methodu cagirildi.");
			return false;
		}
		@Override
		public String next() {
			String deger = kanalListesi.get(index);
			index++;		
			System.out.println("next methodu cagirildi.");
			return deger;
		}
	}
	
	
	
	
	
}
