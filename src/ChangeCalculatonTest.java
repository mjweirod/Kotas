import static org.junit.Assert.*;

import org.junit.Test;
import org.od.kotas.changecalculation.Change;
import org.od.kotas.changecalculation.ChangeCalculation;


public class ChangeCalculatonTest {

	@Test
	public void simpleChangeTest() {
		Change changeCoin = ChangeCalculation.getCoinsFor(.01);
		assertEquals(1, changeCoin.getPennies());
	}
	
	@Test
	public void mediumChangeTest() {
		Change changeCoin = ChangeCalculation.getCoinsFor(.06);
		assertEquals(6, changeCoin.getPennies());
	}
}
