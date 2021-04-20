package classesAndObjects;

public class CountObjects {
//	
//	4.	Write a program which keeps track of the number of 
//	objects that are created and display the count in a function called display().
	static int count = 0;
	public CountObjects() {
		count++;
	}
	
	public static void main(String[] args) {
		CountObjects countObj1 = new CountObjects();
		CountObjects countObj2 = new CountObjects();
		CountObjects countObj3 = new CountObjects();
		CountObjects countObj4 = new CountObjects();
		CountObjects countObj5 = new CountObjects();
		display();
	}
	
	public static void display()
	{
		System.out.println("total "+count+" objects are created");
	}
}
