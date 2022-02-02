
public class ComplexUserCheckService implements ICheckUserService{
	
	@Override
	public boolean checkUser(User user) {
		if(user.getAge() < 18  || user.getName().length() < 5) {
			return false;
		}
		return true;
	}

}
