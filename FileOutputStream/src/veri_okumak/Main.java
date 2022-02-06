package veri_okumak;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		FileInputStream fis = null;
		
		File file = new File("C:\\Users\\user\\Desktop\\dosya.txt");
		
		
		try {
			fis = new FileInputStream(file);
			
			fis.skip(5);
			
		//	System.out.println("Okunan cümle : "+ fis.available());
			
			while(fis.available() > 0) {
				System.out.print((char)fis.read());
			}
			
			System.out.println("\n-----------------");
			
			/*
			System.out.println("Birinci karakter : "+ (char)fis.read());
			System.out.println("Ýkinci karakter : "+ (char)fis.read());
			System.out.println("Ücüncü karakter : "+ (char)fis.read());
			System.out.println("Dördüncü karakter : "+ (char)fis.read());
			System.out.println("Besinci karakter : "+ (char)fis.read());
			*/
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý");			
		} 
		catch (IOException e) {
			System.out.println("Dosya okunurken hata");
		}
		finally {
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatýlýrken hata");				
			}
		}
		
		
		
	}

}
