package veri_yazmak;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		FileOutputStream outputStream = null;
		
		File file = new File("dosya.txt");
		
		try {
			
			outputStream = new FileOutputStream(file, true);
		//	outputStream.write(65);
			
		//	outputStream.write(74);
			
			String isim = "Tolga Ocal";
			
			byte[] isimArray = isim.getBytes();
			
			outputStream.write(isimArray);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý hatasý");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosyaya yazarken hata");
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatýlýrken hata");
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
