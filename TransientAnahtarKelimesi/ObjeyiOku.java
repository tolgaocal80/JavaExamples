import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjeyiOku {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("ogrenci.bin");
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
			
			Ogrenci ogrenci = (Ogrenci) inputStream.readObject();
			
			System.out.println(ogrenci);
			System.out.println("Ogrenci sayisi : "+ogrenci.getOgrenciSayisi());
			 
		} catch (ClassNotFoundException e1) {
			System.out.println("Objeye ait sınıf bulunamadı.");
		} 
		
		
	}
	
	
}
