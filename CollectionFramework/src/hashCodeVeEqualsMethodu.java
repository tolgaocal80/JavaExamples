import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Player{
	
	private int id;
	private String isim;
	
	public Player(int id, String isim) {
		this.id = id;
		this.isim = isim;
	}
	@Override
	public String toString() {
		return "Player isim : "+this.isim+ " id : "+this.id;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isim);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(isim, other.isim);
	}
	
}

public class hashCodeVeEqualsMethodu {
	
	
	public static void main(String[] args) {
		
		
		Set<Player> hashset = new HashSet<Player>();
		
		Player player = new Player(1, "James");
		Player player1 = new Player(11, "James");
		Player player2 = new Player(10, "George");
		Player player3 = new Player(6, "Emre");
		
		hashset.add(player);
		hashset.add(player1);
		hashset.add(player2);
		hashset.add(player3);
		hashset.add(player3);
		
		/*
		 * 
		 * Set interface i objelerin aynı olup olmadığını kontrol etmek için
		 * hashCode ve equals methodlarını kullanır. Eger istediğimiz sınıfta
		 * (burada Player sınıfı) hashcode ve equals methodlarını override edip, "bu sınftan olusacak iki objenin
		 * esit olup olmadığına şu fieldleri kontrol ederek, karşılaştırarak karar ver demezsek, hashset olustururken
		 * iki farklı obje girdiğimiz için objelerin attributesleri aynı olsa da farklı objeler olduğundan farklı olarak degerlendirecek
		 * ve hasset e ekleyecek.
		 * Bunu ise, istediğimiz sınıfta (Player) hashCode ve equals methodlarını otomatik olarak override
		 * ederek engelleyebiliriz, evet aynı attributesli objelerin hashset e iki kez eklenmesini istemiyorsak bunu yapabiliriz.
		 * 
		 * 
		 * SET LERDE KENDİ CLASS LARIMIZI KULLANACAKSAK BU SEKİLDE EQUALS VE HASHCODE METHODLARINI OVERRİDE EDEREK YAPABİLİRİZ.
		 * 
		 */
		
		System.out.println(hashset.size());
		for(Player p : hashset) {
			System.out.println(p);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
