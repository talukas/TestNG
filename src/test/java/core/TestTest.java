package core;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
	@Test(enabled = true)
	public void test() {
		AssertJUnit.assertEquals("abc", "abc", "Error message");
	} //method (test)
} //class