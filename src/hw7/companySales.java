/*
	This program allows the user to create Services and Supplies objects and prints out their toStrings and
		runs each of their unique CalculateSales methods.
		
	Author: Darryl Karney
	Course: CPSC24500
 */

package hw7;

import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class companySales {

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<>();
		
		//Get amount of objects to create from user
		String amountOfObjectsString = JOptionPane.showInputDialog("How many objects would you like to add?");
		int amountOfObjectsInt = Integer.parseInt(amountOfObjectsString);
		
		//Create the amount of objects the user input
		for(int i = 0; i < amountOfObjectsInt; i++) {			
			String[] selectionOptions = { "Service", "Supply" };
			int selectedIndex = -1;
			
			//Get from user which object to create
			selectedIndex = JOptionPane.showOptionDialog(null,  "Which type of object would you like to add?", "Homework 7", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, selectionOptions, selectionOptions[0]);
			
			final int serviceIndex = 0;
			final int supplyIndex = 1;
			
			switch(selectedIndex) {
			case serviceIndex:
				//Get number of hours from user
				double numberOfHours = getValidDoubleInput("Service: Enter number of hours:");
				
				//Get rate per hour from user
				double ratePerHour = getValidDoubleInput("Service: Enter rate per hour:");
				
				//Get account id from user
				int accountIdService = getValidIntInput("Service: Enter account id:");
				
				//Create service object and add to accountList
				accountList.add(new Services(numberOfHours, ratePerHour, accountIdService));
				break;
				
			case supplyIndex:
				//Get number of items from user
				int numberOfItems = getValidIntInput("Supply: Enter number of items:");
				
				//Get price per item from user
				double pricePerItem = getValidDoubleInput("Supply: Enter price per item:");
				
				//Get account id from user
				int accountIdSupply = getValidIntInput("Supply: Enter account id:");
				
				//Create supply object and add to accountList
				accountList.add(new Supplies(numberOfItems, pricePerItem, accountIdSupply));
				break;
			}
		}
		
//		accountList.add(new Services(8, 10.25, 1));
//		accountList.add(new Supplies(4, 5.5, 2));
//		accountList.add(new Services(32, 15.75, 3));
//		accountList.add(new Supplies(25, 7.82, 4));
		
		//Output results
		JTextArea outputTextArea = new JTextArea(11, 20);
		
		for(Account e : accountList) {
			outputTextArea.append(e.toString());
			outputTextArea.append(e.CalculateSales());
		}
		
		JOptionPane.showMessageDialog(null, outputTextArea, "Output", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Gets input from user and ensures the input is a valid double value
	private static double getValidDoubleInput(String prompt) {
		boolean validInput = false;
		double inputDouble = 0;
		
		while(!validInput) {
			String inputString = JOptionPane.showInputDialog(prompt);
			
			try {
				inputDouble = Double.parseDouble(inputString);
				validInput = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid input! Please try again.");
			}
		}
		
		return inputDouble;
	}
	
	//Gets input from user and ensures the input is a valid integer value
	private static int getValidIntInput(String prompt) {
		boolean validInput = false;
		int inputInt = 0;
		
		while(!validInput) {
			String inputString = JOptionPane.showInputDialog(prompt);
			
			try {
				inputInt = Integer.parseInt(inputString);
				validInput = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid input! Please try again.");
			}
		}
		
		return inputInt;
	}
}
