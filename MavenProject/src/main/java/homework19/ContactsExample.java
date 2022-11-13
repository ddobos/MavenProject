package homework19;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ContactsExample extends BaseTest {

	@Test
	public void sendFormTest() throws InterruptedException {
		driver.get("https://keybooks.ro/contacts/");
		WebElement elementName = driver.findElement(By.cssSelector("input[name='your-name']"));
		WebElement elementEmail = driver.findElement(By.cssSelector("input[name='your-email']"));
		WebElement elementSubject = driver.findElement(By.cssSelector("input[name='your-s']"));
		WebElement elementMessage = driver.findElement(By.cssSelector("textarea[name='your-message']"));
		WebElement elementSend = driver.findElement(By.cssSelector("input[type='submit'][value*='Message']"));
		
		
		elementName.sendKeys("Denis");
		elementEmail.sendKeys("ddobos40@gmail.com");
		elementSubject.sendKeys("homework 19");
		elementMessage.sendKeys("Mesaj scurt");
		elementSend.click();
		Thread.sleep(1000);
		WebElement elementFinalMessage = driver.findElement(By.cssSelector("div[class='wpcf7-response-output']"));
		assertEquals(elementFinalMessage.getText(), "Thank you for your message. It has been sent.");
	}
}
