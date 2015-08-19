package com.srivastava.logic;

public class Employee {
	
	public double calculateSalary(double salary){
		if(salary<=0){
			throw new RuntimeException("Can't Compute the salary as it is zero");
		}
		double hra = salary *0.30;
		double ta = salary *.10;
		double da = salary *.20;
		double netSalary = salary + hra + da + ta;
		
		for(long i = 1 ; i<=1000000; i++){
			System.out.println("Long Process "+i);
		}
		
		return netSalary;
	}

}
