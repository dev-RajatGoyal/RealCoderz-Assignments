package classesAndObjects;

public class StringManager {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Java";
		char c = 'W';
		String result = insertString(str1,str2,c);
		System.out.println(result);
	}
	
	public static String insertString(String str1, String str2, char c)
	{
		StringBuilder sb = new StringBuilder(str1);
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)==c)
			{
				sb.insert(i, str2);
			}
		}
		return sb.toString();
	}
}
