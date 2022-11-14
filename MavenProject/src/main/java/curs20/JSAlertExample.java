package curs20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSAlertExample extends BaseTest{
	
	@Test(priority = 1)
	public void JSAleertExample() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert jsAlert = driver.switchTo().alert();
		jsAlert.accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
	}
	
	@Test(priority = 2)
	public void condfirmationJS() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		Alert jsAlert = driver.switchTo().alert();
		jsAlert.dismiss();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You clicked: Cancel");
	}

	@Test(priority = 3)
	public void promtJS() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick='jsPromt()']")).click();
		Thread.sleep(3000);
		Alert jsAlert = driver.switchTo().alert();
		jsAlert.sendKeys("Test");
		jsAlert.accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You entered: Test");
	}
}
