package Package.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void testName() throws Exception {
		assertEquals(1, 1);
	}
}
