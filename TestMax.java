import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMax {

	//LARGE NEGATIVE X ?
	@Test
	void test_LargeNegative_x_LargeNegative() {
		double a = Math.pow(-7, 111);
		double b = Math.pow(-3, 209);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargeNegative_x_SmallNegative() {
		double a = Math.pow(-3, 231);
		double b = -50;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_LargeNegative_x_minusOne() {
		double a = Math.pow(-2, 251);
		double b = -1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_LargeNegative_x_zero() {
		double a = Math.pow(-2, 199);
		double b = 0;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_LargeNegative_x_one() {
		double a = Math.pow(-5, 157);
		double b = 1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_LargeNegative_x_smallPositive() {
		double a = Math.pow(-6, 173);
		double b = 40;
		assertEquals(Math.max(a, b), b);

	}
	@Test
	void test_LargeNegative_x_LargePositive() {
		double a = Math.pow(-3, 201);
		double b = Math.pow(5, 150);
		assertEquals(Math.max(a, b), b);
	}
	
	//SMALL NEGATIVE X ?
	@Test
	void test_SmallNegative_x_LargeNegative() {
		double a = -100;
		double b = Math.pow(-3, 225);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallNegative_x_SmallNegative() {
		double a = -110;
		double b = -70;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallNegative_x_minuxOne() {
		double a = -11;
		double b = -1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallNegative_x_Zero() {
		double a = -25;
		double b = 0;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallNegative_x_one() {
		double a = -7;
		double b = 1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallNegative_x_smallpositive() {
		double a = -3;
		double b = 25;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallNegative_x_LargePositive() {
		double a = -11;
		double b = Math.pow(7, 90);
		assertEquals(Math.max(a, b), b);
	}

	//MinusOne X ?
	@Test
	void test_MinusOne_x_LargeNegative() {
		double a = -1;
		double b = Math.pow(-2, 221);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_MinusOne_x_SmallNegative() {
		double a = -1;
		double b = -57;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_MinusOne_x_minusOne() {
		double a = -1;
		double b = -1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_MinusOne_x_Zero() {
		double a = -1;
		double b = 0;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_MinusOne_x_one() {
		double a = -1;
		double b = 1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_MinusOne_x_smallpositive() {
		double a = -1;
		double b = 70;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_MinusOne_x_LargePositive() {
		double a = -1;
		double b = Math.pow(5, 90);
		assertEquals(Math.max(a, b), b);
	}

	//Zero X ?
	@Test
	void test_Zero_x_LargeNegative() {
		double a = 0;
		double b = Math.pow(-2, 221);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_Zero_x_SmallNegative() {
		double a = 0;
		double b = -57;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_Zero_x_minusOne() {
		double a = 0;
		double b = -1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_Zero_x_Zero() {
		double a = 0;
		double b = 0;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_Zero_x_one() {
		double a = 0;
		double b = 1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_Zero_x_smallpositive() {
		double a = 0;
		double b = 70;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_Zero_x_LargePositive() {
		double a = 0;
		double b = Math.pow(5, 90);
		assertEquals(Math.max(a, b), b);
	}

	//One X ?
	@Test
	void test_One_x_LargeNegative() {
		double a = 1;
		double b = Math.pow(-2, 221);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_One_x_SmallNegative() {
		double a = 1;
		double b = -57;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_One_x_minusOne() {
		double a = 1;
		double b = -1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_One_x_Zero() {
		double a = 1;
		doble b = 0;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_One_x_one() {
		double a = 1;
		double b = 1;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_One_x_smallpositive() {
		double a = 1;
		double b = 70;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_One_x_LargePositive() {
		double a = 1;
		double b = Math.pow(5, 90);
		assertEquals(Math.max(a, b), b);
	}
	
	//SmallPositive X ?
	@Test
	void test_SmallPositive_x_LargeNegative() {
		double a = 10;
		double b = Math.pow(-2, 221);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallPositive_x_SmallNegative() {
		double a = 15;
		double b = -57;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallPositive_x_minusOne() {
		double a = 88;
		double b = -1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallPositive_x_Zero() {
		double a = 66;
		double b = 0;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallPositive_x_one() {
		double a = 111;
		double b = 1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_SmallPositive_x_smallpositive() {
		double a = 55;
		double b = 70;
		assertEquals(Math.max(a, b), b);
	}
	@Test
	void test_SmallPositive_x_LargePositive() {
		double a = 102;
		double b = Math.pow(5, 90);
		assertEquals(Math.max(a, b), b);
	}
	
	
	//Large Positive X ?
	@Test
	void test_LargePositive_x_LargeNegative() {
		double a = Math.pow(12, 221);
		double b = Math.pow(-2, 221);
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_SmallNegative() {
		double a = Math.pow(122, 21);
		double b = -57;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_minusOne() {
		double a = Math.pow(122, 198);
		double b = -1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_Zero() {
		double a = Math.pow(55, 211);
		double b = 0;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_one() {
		double a = Math.pow(59, 81);
		double b = 1;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_smallpositive() {
		double a = Math.pow(533, 31);
		double b = 70;
		assertEquals(Math.max(a, b), a);
	}
	@Test
	void test_LargePositive_x_LargePositive() {
		double a = Math.pow(333, 111);
		double b = Math.pow(5, 90);
		assertEquals(Math.max(a, b), a);
	}
	
}

