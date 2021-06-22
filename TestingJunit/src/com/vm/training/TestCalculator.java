package com.vm.training;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {


	@Test
	public void testAdd ()
	{
		try
		{  
			int actual = 0;
			int expected = 30;
			actual = Calculator.add(10,20);
			assertEquals(expected,actual);
		}

		catch(Exception e){

			e.printStackTrace();
		}
	}
}