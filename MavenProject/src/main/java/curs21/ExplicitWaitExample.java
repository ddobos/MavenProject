package curs21;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ExplicitWaitExample extends BaseTest {

	@Test(priority = 1)
	public void explicitExample() {
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='finish']")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[id='finish']"), "Hello World!"));
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']"));
		assertEquals(finish.getText(), "Hello World!");
	}
}
