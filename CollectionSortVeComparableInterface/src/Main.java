import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Php");
		list.add("Go");
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
		System.out.println();
		Collections.sort(list, new BuyuktenKucugeString());
		
	 	for (String string : list) {
			System.out.println(string);
		}
		
		*/
		
		List<Player> listPlayer = new ArrayList<Player>();
		
		listPlayer.add(new Player("Murat", 5));
		listPlayer.add(new Player("Tolga", 1));
		listPlayer.add(new Player("James", 7));
		listPlayer.add(new Player("Clarie", 51));
		
		Player p1 = new Player("Murat", 5);
		Player p2 = new Player("Tolga", 1);
		
	//	System.out.println(p1.compareTo(p2));
		
	//	Collections.sort(listPlayer, new KucuktenBuyugePlayer());
		
		Collections.sort(listPlayer, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				return -o1.getIsim().compareTo(o2.getIsim());
			}
			
		});
		
		
		for (Player player : listPlayer) {
			System.out.println(player);
		}
		
			
	}
	
	
}
