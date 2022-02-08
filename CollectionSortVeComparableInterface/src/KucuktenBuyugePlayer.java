import java.util.Comparator;

public class KucuktenBuyugePlayer implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getId() < o2.getId()) {
			return -1;
		}
		else if(o1.getId() > o2.getId()) {
			return 1;
		}
		return 0;
	}
	
	
}
