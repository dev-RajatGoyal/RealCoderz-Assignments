package inheritenceActivity;

public class InhertitenceActivity {
	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		manager.calculateSalaray();
		manager.calculateTransportAllowance();
		trainee.calculateSalaray();
		trainee.calculateTransportAllowance();
	}
}
