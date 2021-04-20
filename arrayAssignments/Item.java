package arrayAssignments;

public class Item {

	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, double itemPrice, double itemDiscount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDiscount = itemDiscount;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemDiscount() {
		return itemDiscount;
	}

	public void setItemDiscount(double itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	
}
