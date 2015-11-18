package org.od.kotas.changecalculation;
import static org.junit.Assert.*;

import org.approvaltests.Approvals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;


public class ChangeCalculationTest {

	@Test
	public void testAll() throws Exception {
 Approvals.verifyAll(Range.get(1, 99),  i -> String.format("%s -> %s", i,ChangeCalucator.dispense(i) ));
	}
	@Test
	public void testSimpleChange() throws Exception {
		Change change = ChangeCalucator.dispense(1);
		assertEquals(1, change.pennies);
	}
	
	@Test
	public void test2CentsChange() throws Exception {
		Change change = ChangeCalucator.dispense(2);
		assertEquals(2, change.pennies);
	}
	
	@Test
	public void testNickel() throws Exception {
		Change change = ChangeCalucator.dispense(5);
		assertEquals(1,  change.nickels);
	}
}
