package revise;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathsTest {

	@Test
    @BeforeEach
	void one() {
		System.out.println("Good morning");
	}
	
	
	@Test
	@DisplayName("add method")
	//@Disabled
	
	void testAddition() {
		Maths mt=new Maths();
		assertEquals(4,mt.addition(2,2),"Addition Done here");
	}
	

}
