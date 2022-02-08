import java.util.Comparator;

public class BuyuktenKucugePlayer implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {

		return o1.getIsim().compareTo(o2.getIsim());
	}

}
