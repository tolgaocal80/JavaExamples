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
		
		File file = new File("ogrenci.bin");
		
		Ogrenci ogrenci = new Ogrenci("Mustafa",1234, "Makine Müh.");
		
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));){
			
			Ogrenci.setOgrenciSayisi(100);
			
			stream.writeObject(ogrenci);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");
		} catch (IOException e1) {
			System.out.println("Dosyaya yazmada hata");
		}
		
		
	}
	
	
	

}
