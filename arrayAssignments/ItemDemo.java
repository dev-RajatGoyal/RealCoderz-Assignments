package arrayAssignments;

import java.util.Scanner;

public class ItemDemo {

	static Item[] items;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		items = new Item[5];
		for(int i=0; i<items.length; i++) {
			System.out.println("enter details of item "+(i+1));
			System.out.println("enter item id, item name, item price, discount");
			items[i] = new Item(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
		}
		
		Item item = getLeastPriceItem(items);
		System.out.println("item with least price");
		System.out.println("item id "+item.getItemId());
		System.out.println("item name "+item.getItemName());
		System.out.println("item price "+(item.getItemPrice() - item.getItemDiscount()));
	}
	
	public static Item getLeastPriceItem(Item[] items) {
		/*
		 * double final_price = 0; for(Item item : items) { 
		 * final_price = item.getItemPrice() - item.getItemDiscount(); 
		 * item.setItemPrice(final_price);
		 * }
		 */
		
		Item item = items[0];
		for(int i=1; i<items.length; i++) {
			if((item.getItemPrice() - item.getItemDiscount()) > (items[i].getItemPrice() - items[i].getItemDiscount())) {
				item = items[i];
			}
		}
		
		return item;
	}
}
