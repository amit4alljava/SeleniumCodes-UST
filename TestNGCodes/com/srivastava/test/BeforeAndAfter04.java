package com.srivastava.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfter04 {
	//@BeforeClass	
	 @BeforeMethod 
	 public void start(){
		 System.out.println("Before TEST *********************");
	 }
		
	  @Test
	  public void checkBalance() {
	  System.out.println("Check Balance");
	  }
	  
	  @Test
	  public void checkBalance2() {
	  System.out.println("Check Balance2");
	  }
	  @AfterMethod
	  public void end(){
	 	 System.out.println("After TEST **************************");
	  }
	  
	 
	  @Test(enabled=false)
	  public void checkAccount(){
		  System.out.println("Not Run...");
	  }
	  
	  
}
