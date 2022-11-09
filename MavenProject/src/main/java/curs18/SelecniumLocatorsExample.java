package curs18;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SelecniumLocatorsExample extends BaseTest {

	@Test(priority = 1)
	public void tagNameLocator() throws InterruptedException {
//		Thread.sleep(10000);

		WebElement dicoverELementEm = driver.findElement(By.tagName("em"));
		dicoverELementEm.click();
		//dicoverELementEm.clear(); //org.openqa.selenium.InvalidElementStateException: invalid element state
		// nu poate aplica metoda clear pe webElemenet
		String text = dicoverELementEm.getText();
		System.out.println(text);
		
		assertEquals(text, "Discover");
	}
	
	@Test(priority = 2)
	public void linkTextLocator() {
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		System.out.println(driver.getCurrentUrl());
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority = 3)
	public void partialLinkTextLocator() {
		WebElement cookingBook = driver.findElement(By.partialLinkText("Cooking"));
		cookingBook.click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
	}
	
	@Test(priority = 4)
	public void classNameLocator() throws InterruptedException {
		
		WebElement price = driver.findElement(By.className("price"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow;border: 2px sold red')", price);
		String textPrice = price.getText();
		assertTrue(textPrice.contains("20.55"));
	}

	@Test(priority = 5)
	public void idLocator() {
		
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		System.out.println(reviewTab.getRect().y);
		System.out.println(reviewTab.getLocation().getY());
		jse.executeScript("window.scrollBy(0,"+reviewTab.getLocation().getY()+" )", reviewTab);
		reviewTab.click();
		WebElement commentBox = driver.findElement(By.id("comment"));
		assertTrue(commentBox.isDisplayed());
		
	}
	
	@Test(priority = 6)
	public void nameLocator() throws InterruptedException {
		
		WebElement commentBox = driver.findElement(By.name("comment"));
		commentBox.sendKeys("Salut Badei");
		
	}
	
	@Test(priority = 7)
	public void cssSelectorLocator() throws InterruptedException {
		
		WebElement authorField = driver.findElement(By.cssSelector("input[name='author']"));
		authorField.sendKeys("Test Ceva");
		authorField.clear();
		authorField.sendKeys("alt ceva");
		
	}
	
	@Test(priority = 8)
	public void xpathLocator() {
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		emailField.sendKeys("ddobo@mtc.md");
		
	}
}
