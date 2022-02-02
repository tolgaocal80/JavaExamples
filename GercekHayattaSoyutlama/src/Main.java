
public class Main {
	
	public static void main(String[] args) {
		
		
		SignUpManager manager = new SignUpManager(new ComplexUserCheckService());
		
		manager.signUp(new User("Tolga", 19));
		
	}

}
