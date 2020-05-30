package hw7;

public class Services extends Account {
	//Create member variables
	private double numberOfHours;
	private double ratePerHour;
	
	//Constructor
	public Services(double numberOfHours, double ratePerHour, int accountid) {
		super(accountid);
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}

	//Implement the CalculateSales method required by parent class
	@Override
	String CalculateSales() {
		return "\nServices sales: $" + super.mydf.format(numberOfHours * ratePerHour);
	}
	
	//Override the toString method to display info on class
	@Override
	public String toString() {
		return super.toString() +
				"\nServices class toString" +
				"\nNumber of hours: " + numberOfHours +
				"\nRate per hour: " + ratePerHour +
				"\n******************************";
	}

	/**
	 * @return the numberOfHours
	 */
	public double getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * @param numberOfHours the numberOfHours to set
	 */
	public void setNumberOfHours(double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	/**
	 * @return the ratePerHour
	 */
	public double getRatePerHour() {
		return ratePerHour;
	}

	/**
	 * @param ratePerHour the ratePerHour to set
	 */
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
}
