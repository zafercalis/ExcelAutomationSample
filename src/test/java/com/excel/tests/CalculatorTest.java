package com.excel.tests;

import org.junit.Test;

public class CalculatorTest {
	
	
	@Test
	public void testMyCalculator(){
		
		System.out.println(Calculator.Operate("addition", 3.5, 2.1));
		
		System.out.println(Calculator.Operate("subtraction", 678, 2.1));
		
		System.out.println(Calculator.Operate("multiplication",7, 2.1));

		System.out.println(Calculator.Operate("division", 3.5, 0));

		
	}

}
