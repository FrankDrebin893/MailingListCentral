package login;

public class Authenticator {
	 
	public String authenticate(String username, String password) {
		if (("rasmus".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}