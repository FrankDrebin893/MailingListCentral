package hashing;

import java.io.Serializable;


public class PasswordHasher implements Serializable {
	private static final long serialVersionUID = 1L;
	HashingStrategy hs;
	
	public PasswordHasher() {
		hs = new MD5HashingStrategy();
	}

	public HashingStrategy getHs() {
		return hs;
	}

	public void setHs(HashingStrategy hs) {
		this.hs = hs;
	}

}
