package org.od.kotas.changecalculation;

public class Change {

	public int pennies;
	@Override
	public String toString() {
		return "Change [pennies=" + pennies + ", nickels=" + nickels
				+ ", dimes=" + dimes + ", quarters=" + quarters + "]";
	}
	public int nickels;
	public int dimes;
	public int quarters;

	
}
