 package arrayAssignments;

import java.util.Scanner;

public class ConnectionDemo {

	public static void main(String[] args) {
		Connection[] connection = new Connection[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<connection.length; i++)
		{
			System.out.println("enter details of connection "+(i+1));
			System.out.println("connection id, customer id, customer email and balance");
			connection[i] = new Connection(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextDouble());	
		}	
		System.out.println("enter connectionId to get average balance");
		int n = sc.nextInt();
		System.out.println("Average balance of similar id "+n+" = "+getAverageBalance(connection,n));
	}
	
	public static double getAverageBalance(Connection[] connections , int connectionId)
	{
		double sum = 0;
		int count = 0;
		for(Connection connection : connections)
		{
			if(connection.getConnId() == connectionId)
			{
				sum += connection.getBalance();
				count++;
			}
		}
		
		sum = sum/count;
		return sum;
	
	}
}
