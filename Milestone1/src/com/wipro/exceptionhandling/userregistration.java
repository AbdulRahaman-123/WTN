package com.wipro.exceptionhandling;
class userregistration {
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
		
		
	}

	public static void main(String[] args) {
		userregistration registration = new userregistration();
		
		try {
			registration.registerUser("Rohith", "India");
		} catch (InvalidCountryException e) {
		}
	}

}
class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}
