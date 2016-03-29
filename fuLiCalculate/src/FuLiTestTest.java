import static org.junit.Assert.*;

import org.junit.Test;


public class FuLiTestTest {

	@Test
	public void testMaiGuPiao() {
		double result = new FuLiTest().maiGuPiao(100000,0.1,200000);
		boolean right = 7.2 ==result;
		assertEquals(true, right);
	}

}
