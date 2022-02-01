import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Character[] charDizi = {'J','A','V','A'};
		
		Integer[] intDizi = {1,2,3,4,5,6};
		
		String[] stringDizi = {"Java","Python","C++","Php"};
		
		Ogrenci[] ogrenciDizi = {new Ogrenci("Tolga"), new Ogrenci("Andrew"), new Ogrenci("Buse")};
		
		
		
		System.out.println("Generic method kullanýlarak yazdirildi : ");
		GenericMethod.genericYazdirMetodu(ogrenciDizi);
		System.out.println("--------------");
		GenericMethod.genericYazdirMetodu(stringDizi);
		System.out.println("--------------");
		GenericMethod.genericYazdirMetodu(charDizi);
		System.out.println("********************");
		
		
		System.out.println("Generic Class kullanýlarak yazdýrýldý : ");
		GenericYazdirmaSinifi<Ogrenci> genericYazdirmaSinifi = new GenericYazdirmaSinifi<Ogrenci>();
		genericYazdirmaSinifi.yazdir(ogrenciDizi);
		
		System.out.println("---------------");
		
		GenericYazdirmaSinifi<String> genericYazdirmaSinifi2 = new GenericYazdirmaSinifi<String>();
		
		genericYazdirmaSinifi2.yazdir(stringDizi);
		
		System.out.println("---------------");
		
		GenericYazdirmaSinifi<Character> genericYazdirmaSinifi3 = new GenericYazdirmaSinifi<Character>();
		
		genericYazdirmaSinifi3.yazdir(charDizi);
		System.out.println("\n***************");
		
	}
	
	
}
