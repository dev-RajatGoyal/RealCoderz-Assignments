package firstdayAssignment;

import java.util.Scanner;

public class SalaryDemo {
	public static void main(String[] args) {
//		Write a program which will read basic salary, HRA%, DA% , insurance premium amount and PF%.
//		Program should display on hand salary by adding HRA%, DA% 
//		to basic salary and deducting insurance premium and PF%. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary");
		double basic = sc.nextDouble();
		System.out.println("Enter HRA");
		double hra = sc.nextDouble();
		System.out.println("Enter DA");
		double da = sc.nextDouble();
		System.out.println("Enter Premium");
		double premium = sc.nextDouble();
		System.out.println("Enter PF");
		double pf = sc.nextDouble();
		double finalSalary = calculateGrossSalary(basic,hra,da,premium,pf);
		System.out.println("Final Salary = "+finalSalary);
	}
	
	public static double calculateGrossSalary(double basic, double hra, double da, double premium, double pf)
	{
		double finalHra = (basic*hra / 100) ; //1500
		double finalDa = (basic*da / 100); //900
		double finalPre = (basic*premium / 100); // 1800
		double finalPf = (basic*pf / 100); //2400
		double finalSalary = ((basic + finalHra + finalDa) - ( finalPre + finalPf) );
		return finalSalary;
	}
}
