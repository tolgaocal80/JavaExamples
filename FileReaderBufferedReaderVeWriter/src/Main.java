import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		File file = new File("ogrenciler.txt");
		
		/*
		 * 
		 * Büyük dosyalar kullanılırken buffer sınıflarından kullanılır
		 * FileWriter tek tek gider alıp geri döner, buffered sınıfları toplu olarak işlem yapar
		 *  
		 * 
		 * 
		 */
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File("ogrenciler.txt"), true))){
			
			writer.write("Tolga Öcal,Elektronik Haberleşme Mühendisliği\n");
			
		}catch (Exception e) {
			System.out.println("Dosya acilirken hata olustu.");
		}
		
		/*
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
			
			while(scanner.hasNextLine()) {
				String ogrenciBilgisi = scanner.nextLine();
			    String[] array =  ogrenciBilgisi.split(",");
			    
			    if(array[1].equals("Bilgisayar Mühendisliği")) {
			    	System.out.println("Öğrenci bilgisi : "+ ogrenciBilgisi);
			    }
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		*/
		
	}
	
	
}
