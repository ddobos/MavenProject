package homework21;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWork extends BaseTest {

	@Test(priority = 1)
	public void homeWork() {
		driver.findElement(By.linkText("SINGLE AUTHOR")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		List<WebElement> elements = driver.findElements(By.cssSelector("div[class='sc_skills_total']"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(elements.get(0), "95%"));
		wait.until(ExpectedConditions.textToBePresentInElement(elements.get(1), "75%"));
		wait.until(ExpectedConditions.textToBePresentInElement(elements.get(2), "82%"));
		
		assertEquals(elements.get(0).getText(), "95%");
		assertEquals(elements.get(1).getText(), "75%");
		assertEquals(elements.get(2).getText(), "82%");
		
	}
	
}
