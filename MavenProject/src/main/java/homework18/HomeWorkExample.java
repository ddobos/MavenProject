package homework18;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWorkExample extends BaseTest {
	
	@Test
	public void firstTestExample() {
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		WebElement loginInput = driver.findElement(By.id("log"));
		WebElement passwdInput = driver.findElement(By.id("password"));
		
		assertFalse(loginInput.isDisplayed());
		assertFalse(passwdInput.isDisplayed());
		loginLink.click();
		assertTrue(loginInput.isDisplayed());
		assertTrue(passwdInput.isDisplayed());
		
	}

}
