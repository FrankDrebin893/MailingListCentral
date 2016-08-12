package hashingTests;

import static org.junit.Assert.*;
import hashing.*;
import org.junit.Test;

public class HashingTests {

	@Test
	public void test() {
		String password = "1234";
		PasswordHasher hasher = new PasswordHasher();
		HashingStrategyFactory factory = new HashingStrategyFactory();
		HashingStrategy SHAStrategy = factory.getHashingStrategy("SHA");
		
		System.out.println("Password is " + password);
		String md5Hash = hasher.getHs().hashPassword(password);
		System.out.println("MD5 hash: " + md5Hash);
		
		hasher.setHs(SHAStrategy);
		String shaHash = hasher.getHs().hashPassword(password);
		
		System.out.println("SHA hash: " + shaHash);
		hasher.setHs(factory.getHashingStrategy("MD5"));
		
		String md5Hash2 = hasher.getHs().hashPassword(password);
		System.out.println("MD5 hash 2: " + md5Hash2);
	}

}
