package com.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideMethodTest {

	static DivideMethod divMethod;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		divMethod = new DivideMethod();
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
	public void testDivideMethod() {
		Assertions.assertTrue(divMethod.divide(3, 4) !=  12);
		
	}

}
