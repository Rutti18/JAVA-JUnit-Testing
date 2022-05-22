package com.example;

import org.junit.jupiter.api.Assertions; //changed it to Assertions

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	static Counter counter;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		counter = new Counter();
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
	public void testStartValue() {
		counter.increase();
		Assertions.assertTrue(counter.startValue > 0); // changed it to assertions

	}

	@Test
	public void testCounterIncrease() {

		counter.increase(1);
		System.out.println(counter.startValue);
		Assertions.assertFalse(counter.startValue > 1); // changed it to assertion

	}

}
