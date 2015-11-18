package org.od.kotas.changecalculation;

public class Change {

<<<<<<< HEAD
	@Override
	public String toString() {
		return String.format(
				"Change [pennies=%s, nickles=%s, dimes=%s, quarters=%s]",
				pennies, nickles, dimes, quarters);
	}

	private int pennies;
	private int nickles;
	private int dimes;
	private int quarters;
=======
	private int numberPennies;
	private int numberNickles;
>>>>>>> origin/master

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
		
	}

	public int getNickles() {
		
		return nickles;
	}

	public void setNickles(int nickles) {
		this.nickles = nickles;
	}

<<<<<<< HEAD
	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
=======
	public void setNumberNickles(int i) {
		// TODO Auto-generated method stub
		numberNickles = i;
	}

	public int getNickless() {
		// TODO Auto-generated method stub
		return numberNickles;
	}

>>>>>>> origin/master

}
