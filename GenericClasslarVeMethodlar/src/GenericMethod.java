
public class GenericMethod {
	
	// Generic Method olu�turuldu
	public static <E> void genericYazdirMetodu(E[] e) {
		for(E a: e) {
			System.out.println(a);
		}
	}

}
