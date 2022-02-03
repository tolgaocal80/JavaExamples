import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik ve Fizik Problemleri Program�na Ho�geldiniz...");
        
        String islemler = "��lemler...\n"
                          + "1. Daire Alan� Hesaplama\n"
                          + "2. ��gen �evresi Hesaplama\n"
                          + "3. 2 Vekt�r�n �� �arp�m�n� Hesaplama\n"
                          + "��k�� :  q";
        
        while(true) {
            System.out.println(islemler);
            
            System.out.print("��lemi Se�iniz : ");
            
            String islem = scanner.nextLine();
            
            if (islem.toUpperCase().equals("Q")) {
                System.out.println("Programdan ��k�l�yor...");
                break;  
            }
            else if (islem.equals("1")){
                System.out.print("Dairenin Yar��ap� : ");
                int yaricap = Integer.parseInt(scanner.nextLine());
                
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")){
                System.out.print("Kenar  1: ");
                int kenar1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Kenar 2 : ");
                int kenar2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Kenar 3 : ");
                int kenar3 = Integer.parseInt(scanner.nextLine());
                
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }
            else if (islem.equals("3")){
                Vec vec1 = new Vec("Vekt�r1");
                Vec vec2 = new Vec("Vekt�r2");
                
                Problem.Fizik fizik = new Problem().new Fizik();
                
                fizik.icCarpim(vec1, vec2);
            }
            else {
                System.out.println("Ge�ersiz i�lem...");
            }
        }
		
	}

}
