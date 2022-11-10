package curs19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorExample extends BaseTest
{

	@Test(priority = 1)
	public void cssSelectorExample1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		jse.executeScript("arguments[0].setAttribute('style', 'backgroud:green;border: 4px solid red;')", loginMenu);
		
		WebElement logoSlogan = driver.findElement(By.cssSelector("div[class='logo_slogan']"));
		jse.executeScript("arguments[0].setAttribute('style', 'backgroud:green;border: 4px solid red;')", logoSlogan);
		
	}
	
	@Test(priority = 2)
	public void cssSelectorExample2() {
		
		WebElement loginElem = driver.findElement(By.cssSelector("a[href='#popup_login']"));
		loginElem.click();
		
		WebElement userNameElem = driver.findElement(By.cssSelector("input#log[type='text']"));
		userNameElem.sendKeys("TestUser");
		
		WebElement userPassword = driver.findElement(By.cssSelector("input[id='password'],[name='pwd']"));
		userPassword.sendKeys("TestUser");
	}
	
	@Test(priority = 3)
	public void cssSelectorExample3() {
//		* contains
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='road']"));
		System.out.println(book1.getText());
		
//		~ contains word
		WebElement book2 = driver.findElement(By.cssSelector("a[class~='sc_title']"));
		System.out.println(book2.getText());
		
//		^ starts with
		WebElement book3 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book3.getText());
		
//		$ ends with
		WebElement book4 = driver.findElement(By.cssSelector("a[href$='story']"));
		System.out.println(book4.getText());
	}
	
	@Test(priority = 4)
	public void cssSelectorExample4() throws InterruptedException {
		
		WebElement seletedOption = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'backgroud:green;border: 4px solid red;')", seletedOption);
		
		// not
		List<WebElement> seletedOptions = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected='true'])"));
		for (WebElement element : seletedOptions) {
			jse.executeScript("arguments[0].setAttribute('style', 'backgroud:green;border: 4px solid green;')", element);
			Thread.sleep(1000);
		}
		
	}
	
}
