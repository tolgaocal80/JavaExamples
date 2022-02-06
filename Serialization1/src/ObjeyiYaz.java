import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
	
	
	public static void main(String[] args) {
		
		File file = new File("ogrenci.bin");
		
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));){
			
			Ogrenci ogrenci = new Ogrenci("Tolga Ocal", 16014083, "EHM");
			Ogrenci ogrenci2 = new Ogrenci("Oğuz", 678, "Finans");
			Ogrenci ogrenci3 = new Ogrenci("James", 007,"İstihbarat");
			
			stream.writeObject(ogrenci);
			stream.writeObject(ogrenci2);
			stream.writeObject(ogrenci3);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
		} catch (IOException e1) {
			System.out.println("Dosyaya yazmada hata");
		}
		
		
	}
	
	
	

}
