package testCases;

import org.junit.Test;

import mathOps.MathOperations;

public class Testcase1 {

	@Test
	public void testcase() {
		MathOperations mo = new MathOperations();

		mo.add(5, 10);
		mo.subs(5, 2);
		mo.div(10, 5);
		mo.multi(2, 2);
	}

}
