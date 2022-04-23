package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String res = junit.addstring("Abhishek Dalal,", "E20CSE507");
		assertEquals("Abhishek Dalal,E20CSE507", res);
	}

}
