package firstdayAssignment;

import java.util.Scanner;

public class ShowDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fixed cost");
		double fixedCost = sc.nextDouble();
		System.out.println("Enter variable cost");
		double variableCost = sc.nextDouble();
		System.out.println("Enter rete per ticket cost");
		double ratePerTicket = sc.nextDouble();
		System.out.println("Enter total number of attendees");
		double noOfAttendees = sc.nextDouble();
		double profit = calculateProfit(fixedCost,variableCost,ratePerTicket,noOfAttendees);
		System.out.println("Profit = "+profit);
	}
	
	public static double calculateProfit(double fixedCost, double variableCost, double ratePerTicket, double noOfAttendees)
	{
		double totalvariableCost = variableCost*noOfAttendees;
		double totalCost = totalvariableCost+fixedCost;
		double totalIncome = ratePerTicket*noOfAttendees;
		double profit = totalIncome-totalCost;
		return profit;
	}
}
