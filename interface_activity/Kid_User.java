package interface_activity;

public class Kid_User implements LibraryUser{

	private int age;
	private String book_type;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}

	@Override
	public void registerAccount() {
		
		if(age < 12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		
		if(book_type.equals("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}
