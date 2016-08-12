package hashing;
import java.security.*;

import org.apache.commons.codec.binary.Hex;

public class MD5HashingStrategy implements HashingStrategy {
	

	@Override
	public String hashPassword(String password) {
		String hash = "";
		byte[] byteResult;
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(password.getBytes());
			byteResult = md.digest();
			hash = new String(Hex.encodeHex(byteResult));
			return hash;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return null;
	}

}
