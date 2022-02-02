
public class SignUpManager {
	
	
	private ICheckUserService checkUserService;
	
	public SignUpManager(ICheckUserService checkUserService) {
		this.checkUserService = checkUserService;
	}
	
	/* SignUp manager'da, signUp fonksiyonu icine bir dependency verdik, bu kullaným yazýlýmý deðiþime ve güncellemeye kapatabilir,
	bunu engellemek için signUp fonksiyonuna sadece bir interface referansý vermeliyiz, bundan sonra o interface'i implement eden
	farklý servis sýnýflarýndan istedigimizi kullanabiliriz. Ilerde o servisi kullanmak istemezsek sadece interface referansýna farklý 
	bir nesne atayarak bunu saglayabiliriz.
	
	
	public void signUp(User user) {
		
		AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
		
		ComplexUserCheckService complexUserCheckService = new ComplexUserCheckService();
		
		if(ageUserCheckService.checkUser(user)) {
			System.out.println("Kullanýcý kayýt edildi : "+ user.getName());
		}else {
			System.out.println("Kullanýcý kayýt edilemedi.");
		}
	}
	
	*/

	
	/*
	Olmasý gereken model alttaki gibidir. SignUpMgr constructor una, bir IUserCheckService nesnesi alacagini soyledik, 
	alttaki signUp methodu da bu nesneyi kullanarak kullanici kayit sartini kabul durumunu kontrol eder sonrasinda ekrana bilgi bastirir. 
	 */
	public void signUp(User user) {
		
		if(this.checkUserService.checkUser(user)) {
			System.out.println("Kullanýcý kayýt edildi : "+ user.getName());
		}else {
			System.out.println("Kullanýcý kayýt edilemedi.");
		}
	}
	
	

}
