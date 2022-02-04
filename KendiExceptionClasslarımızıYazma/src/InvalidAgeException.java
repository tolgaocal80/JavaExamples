
/*
 * Arithmetic exception, bir Unchecked exception t�r� oldu�u i�in, bu classtan extend
 * etti�imiz InvalidAgeException class �m�z da bir unchecked excepiton olacakt�r. yani java
 * taraf�ndan �ng�r�lmeyen (throws keyword kullanmam�z� istemeyecek). Eger bir checked exception
 * class�ndan extend alsayd�k bize "throws" anahtar kelimesi kullan diyecekti.
 */
public class InvalidAgeException extends ArithmeticException{

	/*
	@Override
	public String getLocalizedMessage() {
		return "Bu bir InvalidAge hatas�d�r.";
	}
	*/
	
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	
	
}
