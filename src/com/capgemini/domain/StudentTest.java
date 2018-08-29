package com.capgemini.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exception.AgeNotWithinRangeException;
import com.capgemini.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()
		throws NameNotValidException,AgeNotWithinRangeException {
		//	assertEquals(null,new Student(11,"Sr",21,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Pallavi",22,"Java"));
			assertThrows(NameNotValidException.class,()-> new Student(11,"Pallavi1",21,"Java"));
	}

}