import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	
	/*
	 * 
	 * TXT dosyas�na yazma i�lemi yap�l�rken kullan�labilir, String leri oldu�u gibi 
	 * yazmakta kullan�labilir.
	 * FileOutputStream gibi FileWriter da dosyaya veri yazmak i�in kullan�l�r
	 * FileWriter daha �ok sadece String i�lemi yap�lacaksa kullan�labilir.
	 * 
	 */
	public static void main(String[] args) {
		
		FileWriter writer = null;
		File file = new File("dosya.txt");
		
		try {
			writer = new FileWriter(file, true);
			
			writer.write("Selamlar ��neli Ada\n");
			writer.write("Tolga �cal\n");
			
		} catch (IOException e) {
			System.out.println("Dosya bulunamad�.");
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatma s�ras�nda hata");
				}
			}
		}
		
		
	}
	
	
}
