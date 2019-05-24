package login;

public interface UserPass {
	String admUser ="admin";
	String admPass ="admin";
	
	public static boolean User(String usuario) {
		if(usuario.equals(admUser)) {
			return true;
		}else{
			return false;
		}
	}
	public static boolean Pass(String password) {
		if(password.equals(admPass)) {
			return true;
		}else {
			return false;
		}
	}
}
