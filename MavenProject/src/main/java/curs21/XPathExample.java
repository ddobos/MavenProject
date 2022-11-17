package curs21;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XPathExample extends BaseTest{
	
	@Test(priority = 1)
	public void xpathExample() {
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("login");
	}

}
