import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Cümleyi giriniz : ");
		
		Scanner scanner = new Scanner(System.in);
		
		String cumle = scanner.nextLine();
		
		System.out.println(palidromeMu(cumle));
		
	}
	
	
	static boolean palidromeMu(String cumle) {
		int count=0;
		Stack<Character> stack = new Stack<Character>();
		for(int i =0; i < cumle.length()/2; i++) {
				stack.add(cumle.charAt(i));
		}
		
		if(cumle.length() % 2 == 0) {
			for(int a = (cumle.length()/2); a < cumle.length(); a++) {
				if(!stack.pop().equals(cumle.charAt(a))) {
					return false;
				}
			}	
		}else {
			for(int a = (cumle.length()/2 + 1); a < cumle.length(); a++) {
				if(!stack.pop().equals(cumle.charAt(a))) {
					return false;
				}
			}	
		}
		return true;
	}
	
	
	
	
	
	
	
	
}
