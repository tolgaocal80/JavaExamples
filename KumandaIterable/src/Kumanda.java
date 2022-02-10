import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda implements Iterable<String>{
	
	private ArrayList<String> kanallar = new ArrayList<>();
	
	public void kanalEkle(String kanal) {
		kanallar.add(kanal);
	}
	
	public void kanalSil(String kanal) {
		kanallar.remove(kanal);
	}
	
	public int kanalSayisi() {
		return kanallar.size();
	}

	@Override
	public Iterator<String> iterator() {
		
		return new kumandaIterator();
	}
	
	
	public class kumandaIterator implements Iterator<String>{

		private int index = 0;
		@Override
		public boolean hasNext() {
			if(index < kanallar.size()) {
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			String deger = kanallar.get(index);
			index++;
			return deger;
		}
		
	}
	
	
	
}
