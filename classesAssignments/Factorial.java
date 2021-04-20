package classesAssignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial");
		int n = sc.nextInt();
		int result = calculateFactorial(n);
		System.out.println("Factorial of "+n+" is = "+result);
	}
	
	public static int calculateFactorial(int n)
	{
		int fact = 1;
		while(n!=0)
		{
			fact *= n;
			n--;
		}
		
		return fact;
	}
}

