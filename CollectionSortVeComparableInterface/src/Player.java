
/*
 * Comparable i implement ettiğim zaman diyorum ki, bu sınıf sıranalabilir.
 * Collections.sort methodu işe yarar.
 * 
 */
public class Player implements Comparable<Player>{
	
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "İsim : "+this.isim + " id : "+ this.id;
	}
	
	
	/*
	 * Bu sınıftan olusturduğum nesnelerin nasıl sıralanmasını istediğimi
	 * belirtmek amacıyla compareTo methodunu override ettim.
	 * Burada Player sınıfı nesnelerinin id lerine göre karsılastırılıp
	 * sıralanmalarını istedim.
	 */
	
	@Override
	public int compareTo(Player player) {
		if(this.id < player.id) {
			return -1;
		}else if(this.id > player.id){
			return 1;
		}
		return 0;
	}
	
	
}
