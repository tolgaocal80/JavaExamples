import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci("Tolga Ocal", 16014083, "EHM");
		Ogrenci ogrenci1 = new Ogrenci("Mustafa", 1024, "BM");
		Ogrenci ogrenci2 = new Ogrenci("Mehmet", 123, "Finans");
		Ogrenci ogrenci3 = new Ogrenci("James", 007,"İstihbarat");
		
		// ogrenci lerden olusan array (dizi)
		Ogrenci[] ogrenciArray = {ogrenci,ogrenci1,ogrenci2,ogrenci3};
		
		// ogrenciArray isimli diziyi, asList methodu ile bir arraylist haline cevirdik
		ArrayList<Ogrenci> ogrenciList = new ArrayList<>(Arrays.asList(ogrenciArray));
		
		
		
		File file = new File("ogrenciler.bin");
		
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));){
			
			/*
			 * bir diziyi serileştirdik
			 */
			stream.writeObject(ogrenciArray);
			
			/*
			 * bir arraylist i serileştirdik
			 */
			stream.writeObject(ogrenciList);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
		} catch (IOException e1) {
			System.out.println("Dosyaya yazmada hata");
		}
		
		
	}
	
	
	

}
