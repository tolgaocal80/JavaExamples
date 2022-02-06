import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjeyiOku {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("ogrenciler.bin");
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
			
			/*
			 * Sırasıyla yazılmalı yoksa çalışmıyor.
			 */
		//	ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>)inputStream.readObject();
			Ogrenci[] ogrenciArray = (Ogrenci[])inputStream.readObject();
			
			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>)inputStream.readObject();
			
			
			for (Ogrenci ogrenci : ogrenciArray) {
				System.out.println(ogrenci);
				System.out.println("-------------");
			}
			
			System.out.println("--------------\n\n");
			
			System.out.println("--------------");
			for (Ogrenci ogrenci : ogrenciList) {
				System.out.println(ogrenci);
				System.out.println("-------------");
			}
			
			 
		} catch (ClassNotFoundException e1) {
			System.out.println("Objeye ait sınıf bulunamadı.");
		} 
		
		
	}
	
	
}
