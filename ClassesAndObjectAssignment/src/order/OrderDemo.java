package order;

import java.util.Scanner;

import customer.Customer;
import item.Item;

public class OrderDemo {

	static Customer customer =  new Customer();
	static Item item = new Item();
	
	public static void main(String[] args) 
	{	
		storeCustomerData();
		storeItemData();
		Order order = new Order();
		storeOrderData(order);
		showOrderData(order);
	}

	public static void storeItemData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter itemId");
		int id = sc.nextInt();
		item.setItemId(id);
		System.out.println("Enter itemNo");
		int ino = sc.nextInt();
		item.setItemNo(ino);
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		item.setQuantity(quantity);
		System.out.println("Enter rate");
		double rate = sc.nextDouble();
		item.setRate(rate);
		System.out.println("Enter total");
		double total = sc.nextDouble();
		item.setTotal(total);
	}
	
	public static void storeCustomerData()
	{
		Scanner sc = new Scanner(System.in);
//		Customer customer = new Customer();
		System.out.println("Enter customer id");
		int id = sc.nextInt();
		customer.setCustomerId(id);
		System.out.println("Enter customer name");
		String name = sc.next();
		customer.setCustName(name);
		System.out.println("Enter region code");
		String rc = sc.next();
		customer.setRegionCode(rc);
	}
	
	public static void storeOrderData(Order order) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order id");
		int oid = sc.nextInt();
		order.setOrderId(oid);
		System.out.println("Enter order date");
		String date = sc.next();
		order.setOrderDate(date);
		order.setCustomer(customer);
		System.out.println("Enter order type");
		String type = sc.next();
		order.setOrderType(type);
		order.setItem(item);
	}
	
	public static void showOrderData(Order order)
	{
		System.out.println("customer id "+order.getCustomer().getCustomerId());
		System.out.println("customer name "+order.getCustomer().getCustName());
		System.out.println("customer region "+order.getCustomer().getRegionCode());
		System.out.println("order id "+order.getOrderId());
		System.out.println("order date "+order.getOrderDate());
		System.out.println("order type "+order.getOrderType());
		System.out.println("item id "+order.getItem().getItemId());
		System.out.println("item no "+order.getItem().getItemNo());
		System.out.println("item quantity "+order.getItem().getQuantity());
		System.out.println("item rate "+order.getItem().getRate());
		System.out.println("item total "+order.getItem().getTotal());
	}
}
