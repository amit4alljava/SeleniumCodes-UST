package com.srivastava.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srivastava.logic.Employee;

public class Basic01 {
	
	@Test
	public void testcalculateSalary(){
		double expectedResult = 120000;
		Employee employee = new Employee();
		double netSalary = employee.calculateSalary(9000);
		System.out.println("NetSalary "+netSalary);
		System.out.println("ExpectedResult "+expectedResult);
		Assert.assertTrue(netSalary>expectedResult);
	}

}
