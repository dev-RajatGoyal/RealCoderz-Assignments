public class Program23
{
	public static void main(String[] args)
	{
		PrimeChecker check = new PrimeChecker();
		System.out.println(check.checkPrime(13));
	}
}

class PrimeChecker
{
	boolean checkPrime(int n)
	{
		int flag = 0;
		for(int div=2; div*div<=n; div++)
		{
			if(n%div==0)
			{
				flag++;
			}
		}
		
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
