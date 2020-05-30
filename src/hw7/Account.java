package hw7;

import java.text.DecimalFormat;

public abstract class Account {
	//Create member variables
	protected int accountid;
	protected DecimalFormat mydf = new DecimalFormat("00.00");
	
	//Constructor
	protected Account(int accountid) {
		this.accountid = accountid;
	}
	
	//Create abstract class signature
	abstract String CalculateSales();
	
	//Override the toString method to display info on class
	@Override
	public String toString() {
		return "\n******************************" +
				"\nAccount class toString" +
				"\nAccount id: " + accountid;
	}

	/**
	 * @return the accountid
	 */
	public int getAccountid() {
		return accountid;
	}

	/**
	 * @param accountid the accountid to set
	 */
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
}
