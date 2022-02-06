import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	
	/*
	 * 
	 * TXT dosyasýna yazma iþlemi yapýlýrken kullanýlabilir, String leri olduðu gibi 
	 * yazmakta kullanýlabilir.
	 * FileOutputStream gibi FileWriter da dosyaya veri yazmak için kullanýlýr
	 * FileWriter daha çok sadece String iþlemi yapýlacaksa kullanýlabilir.
	 * 
	 */
	public static void main(String[] args) {
		
		FileWriter writer = null;
		File file = new File("dosya.txt");
		
		try {
			writer = new FileWriter(file, true);
			
			writer.write("Selamlar Ýðneli Ada\n");
			writer.write("Tolga Öcal\n");
			
		} catch (IOException e) {
			System.out.println("Dosya bulunamadý.");
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatma sýrasýnda hata");
				}
			}
		}
		
		
	}
	
	
}
