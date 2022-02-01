
public class GenericMethod {
	
	// Generic Method oluþturuldu
	public static <E> void genericYazdirMetodu(E[] e) {
		for(E a: e) {
			System.out.println(a);
		}
	}

}
