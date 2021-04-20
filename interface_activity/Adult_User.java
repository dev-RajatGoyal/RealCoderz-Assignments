package interface_activity;

public class Adult_User implements LibraryUser {

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
		
		if(age > 12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		
		if(book_type.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}
