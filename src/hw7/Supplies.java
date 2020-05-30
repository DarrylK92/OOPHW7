package hw7;

public class Supplies extends Account {
	//Create member variables
	private int numberOfItems;
	private double pricePerItem;
	
	//Constructor
	public Supplies(int numberOfItems, double pricePerItem, int accountid) {
		super(accountid);
		this.numberOfItems = numberOfItems;
		this.pricePerItem = pricePerItem;
	}

	//Implement the CalculateSales method required by parent class
	@Override
	String CalculateSales() {
		return "\nSupplies sales: $" + super.mydf.format(numberOfItems * pricePerItem);
	}
	
	//Override the toString method to display info on class
	@Override
	public String toString() {
		return super.toString() +
				"\nSupplies class toString" +
				"\nNumber of items: " + numberOfItems +
				"\nPrice per item: " + pricePerItem +
				"\n******************************";
	}

	/**
	 * @return the numberOfItems
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * @param numberOfItems the numberOfItems to set
	 */
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	/**
	 * @return the pricePerItem
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * @param pricePerItem the pricePerItem to set
	 */
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
}
