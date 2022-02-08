import java.util.Comparator;

public class BuyuktenKucugeString implements Comparator<String>{

	
	/*
	 * Comparator sınıfını implement ederek, bu sınıfı bir COMPARATOR olarak 
	 * kullanabileceğımı belirtmiş oldum.
	 * 
	 * Collections.sort(list, new BuyuktenKucugeString) gibi bir şey yaptığım
	 * zaman; list i, BuyuktenKucugeString sınıfının compare methoduna göre sırala
	 * demiş oluyorum.
	 * 
	 */
	
	
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2); 
	}
	
	
}
