package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyDateTest {

	
	@Test
	void test()
	{
		assertEquals(true,MyDate.checkDate(23,05,2019));
	}
}
