public class Program28
{
	public static void main(String[] args)
	{
		for(int i=2; i<=150; i++)
		{
			int flag = 0;
			for(int div=2; div*div<=i; div++)
			{
				if(i%div==0)
				{
					flag++;
				}
			}
			
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}