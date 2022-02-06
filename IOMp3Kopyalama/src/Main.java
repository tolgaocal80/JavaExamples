import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		dosyaYaz("C:\\Users\\user\\Desktop\\music.mp3", dosyaOku("C:\\Users\\user\\Desktop\\2Pac - Lights Out (2020).mp3", icerik));
	}
	
	
	public static ArrayList<Integer> dosyaOku(String filePath, ArrayList<Integer> icerikList) {
		try {
			FileInputStream in = new FileInputStream(filePath);
			System.out.println("Dosya içeriði okunuyor...");
			while(in.available() > 0) {
				icerikList.add(in.read());
			}
		} catch (IOException e) {
			System.out.println("Dosya bulunamadý...");
		}
		System.out.println("Dosya içeriði okundu...");
		return icerikList;
	}
	
	
	public static void dosyaYaz(String fileName, ArrayList<Integer> arrayList) {
		
		File file = new File(fileName);
		FileOutputStream fileOutputStream = null;
		
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya olusturuldu : "+ file.getCanonicalPath());
				
				fileOutputStream = new FileOutputStream(file);
				
				for (Integer integer : arrayList) {
					fileOutputStream.write(integer);
				}
				
			}else {
				System.out.println("Dosya zaten mevcut : "+ file.getCanonicalPath());
				System.out.println("Üzerine yazýlýyor...");
				
				fileOutputStream = new FileOutputStream(file);
				
				for (Integer integer : arrayList) {
					fileOutputStream.write(integer);
				}
			}
		} catch (IOException e) {
			System.out.println("Dosya olusturulurken hata");
		} finally {
			try {
				if(fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("Dosya kullanýma hazýr.");
				}
			} catch (IOException e) {
				System.out.println("Dosya kapatýlýrken hata");
			}
		}
	}
	
	
	
	
}
