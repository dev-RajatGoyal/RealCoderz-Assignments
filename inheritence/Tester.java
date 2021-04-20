package inhertitence;

class A {
	private void printName(){
		System.out.println("alue-A");
	}
}
class B extends A{
	public void printName(){
		System.out.println("Name-B");
	}
}
public class Tester{
	public static void main (String[] args) {
		B b = new B();
		b.printName();
	}
}
