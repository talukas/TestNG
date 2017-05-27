package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
	@Test(enabled = true)
	public void test() {
		org.testng.Assert.assertEquals("abc", "abc", "Error message");
	} //method (test)
} //class