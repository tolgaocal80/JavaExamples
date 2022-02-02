
public class AgeUserCheckService  implements ICheckUserService{

	@Override
	public boolean checkUser(User user) {
		if(user.getAge() < 18) {
			return false;
		}
		return true;
	}
	
	
}
