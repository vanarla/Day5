package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.MyCalculator1;

class MyCalculatorTest1 {

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(243,MyCalculator1.power(3,5));
		assertEquals(16,MyCalculator1.power(2,4));
	
		
	}
@Test
void testPowerWithZeroInputs()
{
	Exception e;
	e=assertThrows(Exception.class,()->MyCalculator1.power(0, 0));
	assertEquals("n and p should not be zero",e.getMessage());
}
	
	@Test
	void testPowerWithNegativeInputs() 
	{
Exception e;
		
		e=assertThrows(Exception.class,()->MyCalculator1.power(-2,-5));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class,()->MyCalculator1.power(-2, 4));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class,()->MyCalculator1.power(3, -6));
		assertEquals("n and p should not be negative",e.getMessage());
	}
}
