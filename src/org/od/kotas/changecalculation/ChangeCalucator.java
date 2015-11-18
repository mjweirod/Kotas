package org.od.kotas.changecalculation;
public class ChangeCalucator {

	public static Change dispense(int cents) {
		Change change = new Change();
		change.nickels = cents /5;
		// decrement number of nickels by 5
		cents -= change.nickels * 5;
		change.pennies = cents;
		return change;
	}


}
