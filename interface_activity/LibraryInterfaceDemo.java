package interface_activity;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		Kid_User kids = new Kid_User();
		
		kids.setAge(10);
		kids.registerAccount();
		kids.setAge(18);
		kids.registerAccount();
		kids.setBook_type("Kids");
		kids.requestBook();
		kids.setBook_type("Fiction");
		kids.requestBook();
		
		Adult_User adult = new Adult_User();
		adult.setAge(5);
		adult.registerAccount();
		adult.setAge(23);
		adult.registerAccount();
		adult.setBook_type("Kids");
		adult.requestBook();
		adult.setBook_type("Fiction");
		adult.requestBook();
	}
}
