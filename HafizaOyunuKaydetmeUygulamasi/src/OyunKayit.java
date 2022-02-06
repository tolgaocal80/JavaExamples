import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit {
	
	
	public static void oyunKaydet(Kart[][] kartlar) {
		File file = new File("kayit.bin");
		
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
			System.out.println("Oyun kaydediliyor...");
			
			outputStream.writeObject(kartlar);	
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	
	
	public static Kart[][] kayittanAl(){
		
		File file = new File("kayit.bin");
		Kart[][] kartlar = {};
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
			
			System.out.println("Oyun geri yükleniyor...");
			
			kartlar = (Kart[][]) inputStream.readObject();
			
			return kartlar;
		} catch (FileNotFoundException e) {
			System.out.println("Kayıt dosyası bulunamadı.");
		} catch (IOException e1) {
			System.out.println("Dosyayı okurken hata");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return null;
	}
	
	
	
	
}
