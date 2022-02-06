import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		File file = new File("dosya.txt");
		File file2 = new File("harfNotları.txt");
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));){
			
			Scanner scanner = new Scanner(bufferedReader);
			
			while(scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				
				String[] ogrenci = line.split(",");
				
				String isim = ogrenci[0];
				int vize1 = Integer.parseInt(ogrenci[1]);
				int vize2 = Integer.parseInt(ogrenci[2]);
				int fnl = Integer.parseInt(ogrenci[3]);
				
				bufferedWriter.write(harfNotuHesapla(isim, vize1, vize2, fnl)+ "\n");
			}
		} catch (Exception e) {
			System.out.println("Dosya okumada hata olustu.");
		}
		
	}
	
	public static String harfNotuHesapla(String isim, int vize1, int vize2, int fnl) {
		
		String cikti = "";
		double toplamnot = ((vize1 * 3/10.0) + (vize2 * 3/10.0) + (fnl * 4/10.0));
		
		if (toplamnot >= 90) {
            cikti = isim + " bu dersten AA Aldı...";
        }
        else if (toplamnot >= 85) {
            cikti = isim + " bu dersten BA Aldı...";          
        }
        else if (toplamnot >= 80) {
            cikti = isim + " bu dersten BB Aldı...";           
        }
        else if (toplamnot >= 75) {
            cikti = isim + " bu dersten CB Aldı...";          
        }
        else if (toplamnot >= 70) {
            cikti = isim + " bu dersten CC Aldı...";           
        }
        else if (toplamnot >= 65) {
            cikti = isim + " bu dersten DC Aldı...";            
        }
        else if (toplamnot >= 60) {
            cikti = isim + " bu dersten DD Aldı...";            
        }
        else if (toplamnot >= 55) {
            cikti = isim + " bu dersten FD Aldı...";
        }
        else {
            cikti = isim + " bu dersten FF Aldı...";
        }
       return cikti;
	}
	
}
