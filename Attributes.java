package week5.day1Assignment;

import org.testng.annotations.Test;

public class Attributes {
	
	
	@Test(invocationCount=3,groups="Regression")
	public void method1() {
		System.out.println("I am method1");
	}
	
	@Test(priority=-2,groups="Regression")
	public void method2() {
		System.out.println("I am method2");
	}
	
	@Test(groups="Smoke",dependsOnGroups="Regression")
	public void method3() {
		System.out.println("I am method3");
	}
	
	@Test(groups="smoke")
	public void method4() {
		System.out.println("I am method4");
	}
	
	@Test(enabled=false)
	public void method5() {
		System.out.println("I am method5");
	}
	

}
