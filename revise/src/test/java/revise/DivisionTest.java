package revise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DivisionTest {
	//DivisionTest class objects
	Division divisionTest1 = new Division(10, 2); 
	Division divisionTest2 = new Division(10, 0); 
	
	Division divisionTest3 = new Division(10, 5); 
 
	//Test case for division
	@Test
	public void test() {
		System.out.println("In DivisionTestCase1.test");
		assertEquals(5, divisionTest1.division());
	}
 
//expected is arithmetic exception
	@Test
	public void testException() {
		System.out.println("In DivisionTestCase1.testException");
		assertEquals(5, divisionTest2.division());
	}
	//Test case for division
		@Test
		public void test2() {
			System.out.println("In DivisionTestCase3.test");
			assertEquals(2, divisionTest3.division());
		}	
		
		//time test
		
		@Test (timeout=1000)
		public  void testPrintResult() {
			divisionTest1.printResult();
		}
}
