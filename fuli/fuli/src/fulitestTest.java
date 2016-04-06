import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class fulitestTest {

	@Test
	public void testFuli4() {
		double res = new fulitest().fuli4(10);
		boolean right = 7.2 == res;
		assertEquals(true, right);
	}

}
