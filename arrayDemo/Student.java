package arrayDemo;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;


public class Student {

	String name;
	int marks[][] = new int[3][5];
	float total[] = new float[3];
	float average[] = new float[3];

	void accept() {
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name of student");
			name = br.readLine();
//			System.out.println("Enter the number of subjects");
//			int number = Integer.parseInt(br.readLine());
//			marks = new int[number];

			for (int i = 0; i < marks.length; i++) 
			{
				for(int j=0; j < marks[i].length; j++)
				{
					System.out.println("Enter the marks of subject " + (i + 1));
					marks[i][j] = Integer.parseInt(br.readLine());
					total[i] += marks[i][j];
				}
				
				average[i] = total[i] / marks[i].length;
			}
		

		} catch (IOException e) {

		}
	}

	void display() {
		System.out.println("Student Name : " + name);
		for (int i = 0; i < marks.length; i++) {
			for(int j=0; j<marks[i].length; j++)
			{
				System.out.println("The subject marks are : " + marks[i][j]);
			}
			System.out.println("Total : " + total[i]);
			System.out.println("Average : " + average[i]);
		}
		
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.accept();
		st.display();
	}
}
