package day3.Q5;

public class Assignment3Q5 {

	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("raj", "usa");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
