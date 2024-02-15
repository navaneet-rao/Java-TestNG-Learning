package Package.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void testName1() throws Exception {
		assertEquals(1, 1);
	}
	@Test
	public void testName2() throws Exception {
		assertEquals(1, 2);
	}
}
