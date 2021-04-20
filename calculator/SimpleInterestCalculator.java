package calculator;

public class SimpleInterestCalculator {

	double principle;
	int numberofYear;
	
	public SimpleInterestCalculator() {
	}
	
	public SimpleInterestCalculator(double principle, int numberofYear) {
		super();
		this.principle = principle;
		this.numberofYear = numberofYear;
	}

	public void calculateSimpleInterest(){

		double simpleInterest;
		
		if(principle > 100000)
		{
			if(numberofYear > 10)
			{
				simpleInterest = (principle*numberofYear*10)/100;
				System.out.println("The interest amount for a principal of "+principle+" and years "+numberofYear+" is "+simpleInterest);
			}
			else
			{
				simpleInterest = (principle*numberofYear*9.5)/100;
				System.out.println("The interest amount for a principal of "+principle+" and years "+numberofYear+" is "+simpleInterest);
			}
		}
		else if(principle < 100000)
		{
			if(numberofYear > 10)
			{
				simpleInterest = (principle*numberofYear*5)/100;
				System.out.println("The interest amount for a principal of "+principle+" and years "+numberofYear+" is "+simpleInterest);
			}
			else
			{
				simpleInterest = (principle*numberofYear*4.5)/100;
				System.out.println("The interest amount for a principal of "+principle+" and years <number of years> is "+simpleInterest);
			}
		}	
	}
	
	public static void main(String[] args) {
		
		SimpleInterestCalculator simpleInterestCalculator1 = new SimpleInterestCalculator(200000, 12);
		simpleInterestCalculator1.calculateSimpleInterest();
		
		SimpleInterestCalculator simpleInterestCalculator2 = new SimpleInterestCalculator(50000, 12);
		simpleInterestCalculator2.calculateSimpleInterest();
		
		SimpleInterestCalculator simpleInterestCalculator3 = new SimpleInterestCalculator(50000, 5);
		simpleInterestCalculator2.calculateSimpleInterest();
		
	}
}
