package com.bigcorp.crm.test;

import com.bigcorp.crm.base.cours.Maison;
import org.junit.jupiter.api.*;

public class MySecondTest {

	@BeforeAll
	public static void beforeAll(){
		System.out.println("Before all lancé");
	}

	@AfterAll
	public static void afterAll(){
		System.out.println("After all lancé");
	}

	@BeforeEach
	public void beforeEach(){
		System.out.println("Before each lancé");
	}

	@AfterEach
	public void afterEach(){
		System.out.println("After each lancé");
	}

@Test 
public void test1() {
	System.out.println("Test 1 lancé ");
}

	@Test
	public void test2() {
		System.out.println("Test 2 lancé ");
	}

	@Test
	public void testApproxPi() {
		Assertions.assertEquals(3.14, Math.PI, 0.001);
	}



	@Test
	public void testMaisonException() {
		Maison m = new Maison();
		Assertions.assertThrows(IllegalArgumentException.class, () -> m.agranditMaison(-4));
	}

}