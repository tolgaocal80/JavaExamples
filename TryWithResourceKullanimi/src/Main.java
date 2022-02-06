import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter(new File("dosya.txt"))){			
			Scanner scanner = new Scanner(System.in);			
			String dil;			
			while(true) {
				System.out.println("Bir dil giriniz : ");
				dil = scanner.nextLine();
				if(dil.equals("OK")) {
					System.out.println("Programdan çýkýlýyor.");
					break;
				}
				writer.write(dil+'\n');
			}
			
		} catch (IOException e) {
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
	}
	
}
