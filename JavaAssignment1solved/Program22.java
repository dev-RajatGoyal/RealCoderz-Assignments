public class Program22
{
	public static void main(String[] args)
	{
		NumberManipulator num = new NumberManipulator();
		System.out.println("Reverse = "+num.reverseNumber(123));
		System.out.println("Sum = "+num.calculateSum(123));
	}
}

class NumberManipulator
{
	int reverseNumber(int n)
	{
		int result = 0;
		while(n!=0){
			int dig = n % 10;
			result = (result*10) + dig;
			n = n / 10;
		}
		
		return result;
	}
	
	int calculateSum(int n)
	{
		int result = 0;
		while(n!=0)
		{
			int dig = n % 10;
			result += dig;
			n = n / 10;
		}
		return result;
	}
}