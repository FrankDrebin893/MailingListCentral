package hashing;

public class HashingStrategyFactory {
	
	public HashingStrategy getHashingStrategy(String strategyType) {
		if(strategyType == null) {
			return null;
		} 
		else if(strategyType.equalsIgnoreCase("MD5")) return new MD5HashingStrategy();
		else if(strategyType.equalsIgnoreCase("SHA")) return new SHAHashingStrategy();
		
		return null;
	}

}
