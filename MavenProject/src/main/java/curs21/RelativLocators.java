package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import utils.BaseTest;

public class RelativLocators extends BaseTest {

	
	@Test(priority = 1)
	public void relativLocators() {
		
		WebElement price10_20 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']"))
				.toLeftOf(By.cssSelector("a[href*='garden']")));
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		
		jsc.executeScript("arguments[0].setAttribute('style', 'background:yellow;border: 2px solid red')", price10_20);
		
	}
}
