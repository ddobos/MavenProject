package curs22;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XPathExample extends BaseTest{
	
	@Test(priority = 1)
	public void xpathExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement loginPopUp = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid green')", loginPopUp);
		
		loginPopUp.click();
		
		
		//or
		WebElement login =  driver.findElement(By.xpath("//input[@type='text' or @id='log']"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid green')", login);
		
		login.sendKeys("TestUser");
		
		//and
		WebElement passwd = driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid green')", passwd);
		
		passwd.sendKeys("12345@67890");
		
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();
		
		
	}
	
	@Test(priority = 2)
	public void xpathExampleTest2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Settings')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'order')]")).click();
		
															//table[contains(@class, 'woocommerce-orders-table')]/thead/tr/th/span[contains(text(), 'Order')]
		WebElement orderTab = driver.findElement(By.xpath("//table[contains(@class, 'woocommerce-orders-table')]/thead/tr/th/span[contains(text(), 'Order')]"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid green')", orderTab);
		
		WebElement totalTab = driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__headers')]/span)[2]"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid red')", totalTab);
		
		driver.findElement(By.xpath("//tr[contains(@class, 'woocommerce-orders-table__row')]/td[@data-title='Order']/a[contains(text(), '1688')]")).click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1688/");
	}

}
