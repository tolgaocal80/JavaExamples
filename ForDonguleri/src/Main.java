import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir say� giriniz : ");
		
		int faktoriyel = 1;
		
		int sayi = scanner.nextInt();
		
		for(int i=1; i<=sayi ; i++) {
			faktoriyel *= i;
		}
		
		System.out.println("Faktoriyel sonu� : "+ faktoriyel);
		
		scanner.close();
		
	}

}
