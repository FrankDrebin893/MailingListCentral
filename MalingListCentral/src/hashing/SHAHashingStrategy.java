package hashing;
import org.apache.commons.codec.digest.*;

public class SHAHashingStrategy implements HashingStrategy{

	@Override
	public String hashPassword(String password) {
		if(password != null) return DigestUtils.sha512Hex(password);
		else return null;
	}

}
