
public class GenericMethod {
	
	// Generic Method oluşturuldu
	public static <E> void genericYazdirMetodu(E[] e) {
		for(E a: e) {
			System.out.println(a);
		}
	}

}
