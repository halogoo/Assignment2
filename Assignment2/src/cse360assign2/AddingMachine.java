/**
 * Name: Ryan Hill
 * Class ID: 70642
 * Assignment: 2
 * Class Description: Adds and Subtracts Values from a total number
 */
package cse360assign2;

public class AddingMachine 
{

	private int total;
	private String history;
	
	/**
	 * Constructor for AddingMachine
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * 
	 * @return total number in adding machine
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * 
	 * @param value is added to total
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * 
	 * @param value is subtracted from total
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
		
	/**
	 * @return history of transactions is returned
	 */
	public String toString () 
	{
		return history;
	}

	/**
	 * Clears the AddingMachine of all calculation history
	 */
	public void clear () 
	{
		total = 0;
		history = "0";
	}
}
