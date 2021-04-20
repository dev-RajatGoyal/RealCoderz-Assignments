public class Program11
{
	public static void main(String[] args)
	{
		Calculator calci = new Calculator();
		System.out.println("Sum = "+calci.calculateSum(50,50));
		System.out.println("Difference = "+calci.calculateDifference(100,50));
	}
}

class Calculator
{
	int calculateSum(int n1, int n2)
	{
		return n1+n2;
	}
	
	int calculateDifference(int n1, int n2)
	{
		return n1-n2;
	}
}