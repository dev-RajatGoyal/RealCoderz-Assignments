package classesAndObjects;

public class CharacterCount {
	
	public static void main(String[] args) {
		String string = "java programming language";
		char c = 'a';
		int count = countCharacter(string,c);
		System.out.println(c+" occured "+count+" times in "+string);
	}
	
	public static int countCharacter(String string,char c)
	{
		int count = 0;
		for(int i=0; i<string.length(); i++)
		{
			if(string.charAt(i)==c)
			{
				count++;
			}
		}
		
		return count;
	}
}
