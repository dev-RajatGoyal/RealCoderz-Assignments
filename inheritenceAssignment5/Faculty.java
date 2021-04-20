package inheritenceAssignment5;

public abstract class Faculty {
	
	private int id;
	private String name;
	private int age;
	private double salary; 
	
	abstract int countTotalFaculty();
	abstract int countPermanenetTemporaryFaculty();
	abstract Faculty display(int id);
	
}
 