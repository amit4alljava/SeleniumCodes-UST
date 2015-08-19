package com.srivastava.test;

import org.testng.annotations.Test;

import com.srivastava.logic.Employee;

public class NegativeTesting02 {
	
	@Test(expectedExceptions={RuntimeException.class})
	public void testNegative(){
		Employee employee = new Employee();
		employee.calculateSalary(0);
	}

}
