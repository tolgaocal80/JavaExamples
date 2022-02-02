
public class Main {
	
	/*
	 * SOLID prensiblerini kullanm�s olduk burada open-close prensibini yani yaz�l�m�m�z 
	 * de�i�ime acik hale geldi, sadece bir nesne turunu degistirerek istedigimiz user check 
	 * sinifini kullanabiliyoruz.
	 */
	
	public static void main(String[] args) {
		
		SignUpManager manager = new SignUpManager(new ComplexUserCheckService());
		
		manager.signUp(new User("Tolga", 19));
		
	}

}
