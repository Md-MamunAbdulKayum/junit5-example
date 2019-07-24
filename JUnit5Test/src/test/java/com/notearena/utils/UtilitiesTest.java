package com.notearena.utils;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;


@DisplayName("Testing Utilities")
class UtilitiesTest {	
	Utilities utilities;	
	@BeforeEach
	void setUp(TestInfo testInfo, TestReporter testReporter) throws Exception {
		utilities = new Utilities();
		testReporter.publishEntry("Test method: "+testInfo.getTestMethod()+" ,Testing for: "+testInfo.getDisplayName());
	}
		
	@Test
	@DisplayName("check dbConnection")
	@Tag("conncheck")
	@Tag("prod")
	void testDBConnetion() {
		assertTrue(utilities.checkDatabaseConnectivity());
	}
	
	@Test
	@DisplayName("check netConnection")
	@Tag("conncheck")
	@Tag("prod")
	void testNetConnetion() {
		assertTrue(utilities.checkInternetConnectivity());
	}
		
	@Test
	@DisplayName("check accountBalance ")
	@Tag("valuecheck")
	@Tag("prod")
	void testAssertAllBalance() {
		assertAll("test for assertall",()->assertEquals(500000200.00, utilities.getAccountBalance(200.00)),
				()-> assertEquals(500000300.00, utilities.getAccountBalance(300.00)),
				()-> assertEquals(500000500.00, utilities.getAccountBalance(400.00)));
		
	}
	
	@Test
	@DisplayName("check accountBalance ")
	@Tag("valuecheck")
	@Tag("prod")
	void testBalance() {
		assertEquals(500000200.00, utilities.getAccountBalance(200.00));
	}
	
	@Test
	@DisplayName("check accountBalance repeated")
	@RepeatedTest(5)
	@Tag("valuecheck")
	@Tag("prod")
	void testRepeatBalance() {
		assertEquals(500000200.00, utilities.getAccountBalance(200.00));
	}
	
	@Test
	@DisplayName("check production environment")
	void testForProduction() {
		Assumptions.assumeTrue("prod".equals(utilities.getEnvironmentName()),"environment found: "+utilities.getEnvironmentName());
		assertEquals(500000200.00, utilities.getAccountBalance(200.00));
		
	}
	
	@Test
	@DisplayName("check development environment")
	void testForDevelopment() {
		Assumptions.assumeFalse("prod".equals(utilities.getEnvironmentName()),"environment found: "+utilities.getEnvironmentName());
		assertEquals(500000200.00, utilities.getAccountBalance(200.00));
		
	}	
}
