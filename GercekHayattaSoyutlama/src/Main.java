
public class Main {
	
	/*
	 * SOLID prensiblerini kullanmıs olduk burada open-close prensibini yani yazılımımız 
	 * değişime acik hale geldi, sadece bir nesne turunu degistirerek istedigimiz user check 
	 * sinifini kullanabiliyoruz.
	 */
	
	public static void main(String[] args) {
		
		SignUpManager manager = new SignUpManager(new ComplexUserCheckService());
		
		manager.signUp(new User("Tolga", 19));
		
	}

}
