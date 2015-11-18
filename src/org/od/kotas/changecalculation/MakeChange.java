package org.od.kotas.changecalculation;

public class MakeChange {

	public static Change change(int cents) {
		Change change = new Change();
		change.setQuarters(cents/25);
		cents -= change.getQuarters()*25;
		change.setDimes(cents/10);
		cents -= change.getDimes()*10;
		change.setNickles(cents/5);
		cents -= change.getNickles()*5;
		change.setPennies (cents/1);
		return change;
	}

}
