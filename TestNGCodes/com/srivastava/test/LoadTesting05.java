package com.srivastava.test;

import org.testng.annotations.Test;

public class LoadTesting05 {
	@Test(threadPoolSize = 5, invocationCount = 10, timeOut = 10000) 
	public void doMultiThread(){
		System.out.println("Thread Id "+ Thread.currentThread().getId());
}
}
