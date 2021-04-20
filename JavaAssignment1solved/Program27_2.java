public class Program27_2
{
	public static void main(String[] args)
	{
		int n = 6;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		int n1 = 5;
		for(int i=n1; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}