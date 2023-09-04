package revise;


import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Practice {
	
	
		//called only once, before starting all the test cases.
		@BeforeAll
		public static void beforeClass() {
		System.out.println("In beforeClass method.");
		}
		
		//called only once, after finishing all the test cases.
		@AfterAll
		public static void afterClass() {
		System.out.println("In afterClass method");
		}
		
		//called before each test case.
		@BeforeEach
		public void before() {
		System.out.println("In before method");
		}
		
		//called after each test case.
		@AfterEach
		public void after() {
		System.out.println("In after method");
		}
		
		//define the test case.
		@Test
		public void testCase1() {
		System.out.println("In testCase1");
		}
		
		//define the test case.
		@Test
		public void testCase2() {
		System.out.println("In testCase2");
		}
		//ignore the test case.It will not execute.
		@Ignore
		@Test
		public void testCase3() {
		System.out.println("In testCase3");
		} }
	

