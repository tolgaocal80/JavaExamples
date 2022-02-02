
public class SignUpManager {
	
	
	private ICheckUserService checkUserService;
	
	public SignUpManager(ICheckUserService checkUserService) {
		this.checkUserService = checkUserService;
	}
	
	/* SignUp manager'da, signUp fonksiyonu icine bir dependency verdik, bu kullan�m yaz�l�m� de�i�ime ve g�ncellemeye kapatabilir,
	bunu engellemek i�in signUp fonksiyonuna sadece bir interface referans� vermeliyiz, bundan sonra o interface'i implement eden
	farkl� servis s�n�flar�ndan istedigimizi kullanabiliriz. Ilerde o servisi kullanmak istemezsek sadece interface referans�na farkl� 
	bir nesne atayarak bunu saglayabiliriz.
	
	
	public void signUp(User user) {
		
		AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
		
		ComplexUserCheckService complexUserCheckService = new ComplexUserCheckService();
		
		if(ageUserCheckService.checkUser(user)) {
			System.out.println("Kullan�c� kay�t edildi : "+ user.getName());
		}else {
			System.out.println("Kullan�c� kay�t edilemedi.");
		}
	}
	
	*/

	
	/*
	Olmas� gereken model alttaki gibidir. SignUpMgr constructor una, bir IUserCheckService nesnesi alacagini soyledik, 
	alttaki signUp methodu da bu nesneyi kullanarak kullanici kayit sartini kabul durumunu kontrol eder sonrasinda ekrana bilgi bastirir. 
	 */
	public void signUp(User user) {
		
		if(this.checkUserService.checkUser(user)) {
			System.out.println("Kullan�c� kay�t edildi : "+ user.getName());
		}else {
			System.out.println("Kullan�c� kay�t edilemedi.");
		}
	}
	
	

}
