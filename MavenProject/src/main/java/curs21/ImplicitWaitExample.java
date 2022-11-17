package curs21;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWaitExample extends BaseTest {

	@Test(priority = 1)
	public void implicitWait() {
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']"));
		assertEquals(finish.getText(), "Hello World!"); 
	}
}
