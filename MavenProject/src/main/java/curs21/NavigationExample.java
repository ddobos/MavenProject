package curs21;

import org.testng.annotations.Test;

import utils.BaseTest;

public class NavigationExample extends BaseTest {

	
	@Test(priority = 1)
	public void navigationTest() {
		
		driver.get("http://emag.ro");
		
		driver.navigate().to("http://altex.ro");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
