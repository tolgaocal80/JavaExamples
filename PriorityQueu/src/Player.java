
public class Player implements Comparable<Player>{
	
	
	private String isim;
	private int id;
	public Player(String isim, int id) {
		super();
		this.isim = isim;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Player [isim=" + isim + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Player player) {
		
		if(this.id < player.id) {
			return -1;
		}
		else if(this.id > player.id) {
			return 1;
		}
		return 0;
	}
	
}
