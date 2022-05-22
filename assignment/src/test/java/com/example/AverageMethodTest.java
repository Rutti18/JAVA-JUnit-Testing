package com.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AverageMethodTest {

	static AverageMethod avgMethod;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		avgMethod = new AverageMethod();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	public void testSumMethod() {
		Assertions.assertEquals(avgMethod.sum(3, 4, 5), 12);
		
	}
	
	@Test
	public void testAverageMethod() {
		Assertions.assertTrue(avgMethod.average(3, 4, 5) == 4);
		
	}
}
