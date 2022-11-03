package curs17;

import org.testng.annotations.Test;

public class TestPriority {

	
	@Test(priority = 1)
	public void one() {
		System.out.println("method First");
	}
	
	@Test(priority = 2)
	public void two() {
		System.out.println("method Second");
	}
	
	@Test(priority = 3)
	public void three() {
		System.out.println("method Third");
	}
	
	@Test
	public void four() {
		System.out.println("method Fourth");
	}
	
	@Test
	public void five() {
		System.out.println("method Fith");
	}
}
