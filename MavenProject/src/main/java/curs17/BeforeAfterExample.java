package curs17;

import org.testng.annotations.*;

public class BeforeAfterExample {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("after suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
