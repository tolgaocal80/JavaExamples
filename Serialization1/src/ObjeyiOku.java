import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjeyiOku {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("ogrenci.bin");
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
			
			Ogrenci ogrenci1 = (Ogrenci) inputStream.readObject();
			Ogrenci ogrenci2 = (Ogrenci) inputStream.readObject();
			Ogrenci ogrenci3 = (Ogrenci) inputStream.readObject();
			
			System.out.println("Okunan öğrnci : "+ ogrenci1.getIsim());
			System.out.println("Numara : "+ ogrenci1.getId());
			System.out.println("Bolum : "+ ogrenci1.getBolum());
			System.out.println("-----------------");
			System.out.println("Okunan öğrnci : "+ ogrenci2.getIsim());
			System.out.println("Numara : "+ ogrenci2.getId());
			System.out.println("Bolum : "+ ogrenci2.getBolum());
			System.out.println("-----------------");
			System.out.println("Okunan öğrnci : "+ ogrenci3.getIsim());
			System.out.println("Numara : "+ ogrenci3.getId());
			System.out.println("Bolum : "+ ogrenci3.getBolum());
			 
		} catch (ClassNotFoundException e1) {
			System.out.println("Objeye ait sınıf bulunamadı.");
		} 
		
		
	}
	
	
}
