package com.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;

class AnimalTest {
	static Animal animal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		animal = new Animal("Brownie", false);
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
	void testAninmalName() {
		Assertions.assertEquals(animal.getName(), "Brownie");

	}

}
