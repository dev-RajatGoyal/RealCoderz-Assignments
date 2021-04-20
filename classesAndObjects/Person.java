package classesAndObjects;

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Full name of the Person is " + firstName + " " + lastName;
	}
	
	
}
