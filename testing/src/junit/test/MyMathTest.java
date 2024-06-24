package testing.src.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import testing.src.junit.MyMath;

class MyMathTest {
	MyMath math = new MyMath();

	@Test
	void calcuateSumTest() {
		assertEquals(6,math.calSum(new int[] {1,2,3}));
	}

	@Test
	void calcuate0LengthArray() {
		int[] numbers = {-1,1,-1,1};
		int result = math.calSum(numbers);
		int expectedResult = 0;
		assertEquals(expectedResult, result);
	}

}
