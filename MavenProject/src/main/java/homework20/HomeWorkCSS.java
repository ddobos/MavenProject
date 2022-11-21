package homework20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class HomeWorkCSS extends BaseTest{
	
	@Test(priority = 1)
	public void openBook() {
		
		driver.findElement(By.cssSelector("a[href='life-in-the-garden']")).click();
		
		driver.findElement(By.cssSelector("a[href*='tab-reviews']")).click();
		
		driver.findElement(By.cssSelector("input[id='submit']")).click();
		
		Alert jsAlert = driver.switchTo().alert();
		jsAlert.accept();
	}
	
	@Test(priority = 2)
	public void sendReviews() {
		driver.findElement(By.cssSelector("a[class='star-5']")).click();
		driver.findElement(By.cssSelector("textarea[id=comment]")).sendKeys("a short comment");
		driver.findElement(By.cssSelector("input[id='author']")).sendKeys("Denis");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ddobos40@gmail.com");
		driver.findElement(By.cssSelector("input[id*='wp-comment'][type='checkbox']")).click();
		
		driver.findElement(By.cssSelector("input[id='submit']")).click();
		WebElement textApprove = driver.findElement(By.cssSelector("div[class='comment-text'] em[class*='awaiting']"));
		
		assertEquals(textApprove.getText(), "Your review is awaiting approval");
	}

}
