package classesAssignments;

public class GreaterFinder {
	
	public static int findGreater2(int n1, int n2)
	{
		return (n1 > n2) ? n1 : n2;
	}
	
	public static int findGreater2(int n1, int n2, int n3)
	{
		int max = n1;
		if(max < n2)
		{
			 max = n2;
		}else if (max < n3){
			max = n3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("Largest between two numbers "+findGreater2(100, 20));
		System.out.println("Largest between three numbers "+findGreater2(50, 220, 100));
	}
}
