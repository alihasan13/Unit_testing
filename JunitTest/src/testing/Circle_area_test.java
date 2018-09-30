package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circle_area_test {

	@Test
	void testCase_1() {
		JunitTesting test= new JunitTesting();
		double result=test.circle_area(2);
		double expected=3.1416*2;
		assertEquals(expected,result);
	}
	
	@Test 
	void testCase_2() {
		JunitTesting test= new JunitTesting();
		double result=test.circle_area(-2);			//checks for the negative numbers.
		double expected=3.1416*-2;
		assertEquals(expected,result);
	}
	
	@Test
	void testCase_3() {
		JunitTesting test= new JunitTesting();
		double result=test.circle_area(0);				//checks for the Zero value.
		double expected=3.1416*0;
		assertEquals(expected,result);
	}

}
