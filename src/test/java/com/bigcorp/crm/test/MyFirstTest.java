package com.bigcorp.crm.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

@Test 
public void testSuccess() {
	int expectedValue = 4;
	int computedValue = 2 + 2;
	Assertions.assertEquals(expectedValue, computedValue);  
}

	@Test
	public void testFailure() {
		Assertions.assertEquals(3, 2);
	}

}