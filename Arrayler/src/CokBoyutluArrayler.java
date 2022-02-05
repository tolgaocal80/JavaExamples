import java.util.Iterator;
import java.util.Scanner;

public class CokBoyutluArrayler {
	
	public static void main(String[] args) {
		
		int[][] array = new int[2][2];
		
		arrayOlustur();
		
		System.out.println("+++++++++++++++++++++");
		
		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;
		
		int[][] array3 = {{4,5},{2,6}};
		
		
		for(int i =0;  i< array3.length; i++) {
			for(int j = 0; j< array3.length; j++) {
				System.out.print(array3[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void arrayOlustur() {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr = new int[2][2];
		
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 2; j++) {
				System.out.print("array["+i+"]["+j+"] değerini giriniz : ");
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 2; j++) {
				System.out.println("array["+i+"]["+j+"] değeri : " + arr[i][j]);
			}
		}
		
	}
	
	
	
	
	
	
	
}

