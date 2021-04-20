package seconddayAssignment;

public class ToyDemo {

	public static void main(String[] args) {

		Toy toy1 = new Toy("apple", "fruits", 250, 15);
		Toy toy2 = new Toy("banana", "fruits", 200, 10);
		Toy toy3 = new Toy("Tiger", "animal", 500, 5);
		Toy toy4 = new Toy("Lion", "animal", 1000, 20);
		String category1="fruit";
		String category2="animal";
		System.out.println(" The Toy with least price is " + getLeastPriceToy(toy1, toy2, toy3, toy4, category2));

	}

	public static String getLeastPriceToy(Toy one, Toy two, Toy three, Toy four, String category) {

//		double min = 1000;
//		double price = 0; 
//		double dis = 0;
//		String name = " ";
//
//		if (category.equals(null)) {
//			System.out.println("No category found");
//		}
//
//		else {
//			if (one.getCategory().equals(category)) {
//				dis = (100 - (one.getDiscount()));
//				price = one.getPrice() * dis;
//				min = price;
//				name = one.getName();
//			}
//
//			if (two.getCategory().equals(category)) {
//				dis = (100 - (two.getDiscount()));
//				price = two.getPrice() * dis;
//				if (price < min) {
//					min = price;
//					name = two.getName();
//				}
//
//			}
//
//			if (three.getCategory().equals(category)) {
//				dis = (100 - (three.getDiscount()));
//				price = two.getPrice() * dis;
//				if (price < min) {
//					min = price;
//					name = three.getName();
//				}
//
//			}
//			if (four.getCategory().equals(category)) {
//				dis = (100 - (four.getDiscount()));
//				price = four.getPrice() * dis;
//				if (price < min) {
//					min = price;
//					name = four.getName();
//				}
//
//			}
//		}
//		return name;
		Toy toy = one;
		if(one.getCategory().equals(category)) 
            toy = one;
            if(two.getPrice()>toy.getPrice())
                toy = two;
        if(category.equals("animal")) 
            toy=three;
            if(four.getPrice()>toy.getPrice())
                toy = four;
            return toy.getName();

	}
}
