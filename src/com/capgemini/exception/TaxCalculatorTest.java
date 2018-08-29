package com.capgemini.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.TaxCalculator;
import com.capgemini.exception.CountryNotValidException;
import com.capgemini.exception.EmployeeNameInvalidException;
import com.capgemini.exception.TaxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws TaxNotEligibleException, CountryNotValidException, EmployeeNameInvalidException {
		assertEquals("Tax amount is 3300.0",TaxCalculator.calculateTax("Tim",55000,true));
		assertEquals("Tax amount is 1750.0",TaxCalculator.calculateTax("Tim",35000,true));
		assertEquals("Tax amount is 11600.0",TaxCalculator.calculateTax("Tim",145000,true));
		assertEquals("Tax amount is 1000.0",TaxCalculator.calculateTax("Tim",25000,true));
	}
	@Test
	void testCalculateTaxWithInvalidName() {
		Exception e;
		e=assertThrows(EmployeeNameInvalidException.class,()->TaxCalculator.calculateTax("",30000,true));
		assertEquals("The employee name cannot be empty",e.getMessage());
		e=assertThrows(EmployeeNameInvalidException.class,()->TaxCalculator.calculateTax(null,30000,true));
		assertEquals("The employee name cannot be empty",e.getMessage());
	}
	@Test
	void testCalculateTaxIneligible()
	{
		Exception e;
		e=assertThrows(TaxNotEligibleException.class,()->TaxCalculator.calculateTax("Tim",1000,true));
		assertEquals("The employee does not need to pay tax",e.getMessage());
	}
	@Test
	void testCalculateTaxWithInvalidCountry()
	{
		Exception e;
		e=assertThrows(CountryNotValidException.class,()->TaxCalculator.calculateTax("Ron",34000,false));
		assertEquals("The employee should be an Indian citizen for calculating tax",e.getMessage());
	}

}
