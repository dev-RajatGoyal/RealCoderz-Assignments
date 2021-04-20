package interface_packages_Assignment;

public interface Record {
	
	void setRecord(StudentRecord[] students);
	StudentRecord displayRecord(StudentRecord[] students);
	public StudentRecord[] searchRecord(String courseName, StudentRecord[] students);
}
