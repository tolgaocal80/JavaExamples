
/*
 * Arithmetic exception, bir Unchecked exception türü olduðu için, bu classtan extend
 * ettiðimiz InvalidAgeException class ýmýz da bir unchecked excepiton olacaktýr. yani java
 * tarafýndan öngürülmeyen (throws keyword kullanmamýzý istemeyecek). Eger bir checked exception
 * classýndan extend alsaydýk bize "throws" anahtar kelimesi kullan diyecekti.
 */
public class InvalidAgeException extends ArithmeticException{

	/*
	@Override
	public String getLocalizedMessage() {
		return "Bu bir InvalidAge hatasýdýr.";
	}
	*/
	
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	
	
}
