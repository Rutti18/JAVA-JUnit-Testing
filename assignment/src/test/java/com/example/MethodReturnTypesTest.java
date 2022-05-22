package com.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MethodReturnTypesTest {

	static MethodReturnTypes methodReturnTypes;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		methodReturnTypes = new MethodReturnTypes();
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
	public void testMethodReturnTypes_forString() {
		Assertions.assertEquals(methodReturnTypes.method1(), "String of Text");
		
	}
	
	@Test
	public void testMethodReturnTypes_forInteger() {
		Assertions.assertFalse(methodReturnTypes.method2() > 6);
		
	}
	
	@Test
	public void testMethodReturnTypes_forBoolean() {
		Assertions.assertTrue(methodReturnTypes.method3() == false);
		
	}


}
