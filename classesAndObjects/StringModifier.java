package classesAndObjects;

public class StringModifier {
	public static void main(String[] args) {
		String string = "Java";
		char c = 'a';
		int position = 2;
		String str = insertCharacter(string,c,position);
		System.out.println(str);
	}
	
	public static String insertCharacter(String string, char c, int position)
	{
		StringBuilder sb = new StringBuilder(string);
		sb.insert(position, c);
		return sb.toString();
	}
}
