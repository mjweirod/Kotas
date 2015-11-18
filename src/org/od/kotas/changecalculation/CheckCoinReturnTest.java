package org.od.kotas.changecalculation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckCoinReturnTest {

	@Test
	public void testChangeFor1Cent() {
		Change change = MakeChange.change(1);
		assertEquals(1, change.getPennies());
	}

	@Test
	public void testChangeFor5Cents() throws Exception {
		Change change = MakeChange.change(5);
		assertEquals(1, change.getNickles());
		assertEquals(0, change.getPennies());
	}

	@Test
	public void testChangeFor10Cents() throws Exception {
		verifyChange(10, "Change [pennies=0, nickles=0, dimes=1, quarters=0]");
	}

	@Test
	public void testChangeFor42Cents() throws Exception {
		verifyChange(42, "Change [pennies=2, nickles=1, dimes=1, quarters=1]");
	}

	private void verifyChange(int cents, String expectedChange) {
		Change change = MakeChange.change(cents);
		assertEquals(expectedChange, change.toString());
	}
}
