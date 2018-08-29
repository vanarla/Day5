package com.capgemini.domain;

import com.capgemini.exception.CountryNotValidException;
import com.capgemini.exception.EmployeeNameInvalidException;

import com.capgemini.exception.TaxNotEligibleException;

public class TaxCalculator {

	public static String calculateTax(String empName, double empSal , boolean isIndian) throws TaxNotEligibleException,CountryNotValidException, EmployeeNameInvalidException {
		
		double taxAmount=1; 
		
		if(!isIndian)
		
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		
		else if(empName==null||empName.equals(""))
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			
			else if(empSal>100000)
				
					taxAmount=empSal*8/100;
				
				else if(empSal<=100000&&empSal>50000)
					taxAmount=empSal*6/100;
				else if(empSal<=50000&&empSal>30000)
					taxAmount=empSal*5/100;
				else if(empSal<=30000&&empSal>10000)
					taxAmount=empSal*4/100;
			
	
			else
			{
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
				
		
		return "Tax amount is "+taxAmount;
		
	}	

}
