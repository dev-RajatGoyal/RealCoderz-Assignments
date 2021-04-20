import java.util.Scanner;

public class Program21
{
	public static void main(String[] args)
	{	
		SeriesCalculator calci = new SeriesCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		
		System.out.println("the sum of "+ n + " term is " + calci.calculateSum(n));
	}
}

class SeriesCalculator
{
	public int calculateSum(int n){
		
		int a = 1;
		int d = 2;
		int sum = 0;
		
		int tn;
		
		sum = (n * (2 * a + (n - 1) * d)) / 2;
		tn = a + (n - 1) * d;
		System.out.println("Sum of the A.P series is : ");
		for(int i = a; i <= tn; i = i+d ){
			if(i != tn){
				System.out.println(i + " , ");
			}
		}
		
		return sum;
	}
}