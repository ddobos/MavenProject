package curs22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest {
	
	@Test(priority = 1)
	public void xpatTest() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//find parent
		WebElement popupLink = driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style','background:orange; border:2px solid green')", popupLink);
		
		popupLink.click();
		
		//descendant
		//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]
		
		//child
		//ul[@id='menu_user']/descendant::div[contains(@class, 'login_field')]/child::input[@id='log']
		
		WebElement userName = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		userName.sendKeys("TestUser");
		
		WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']"));
		
		password.sendKeys("12345@67890");
		
		//followind
		WebElement rememberMe = driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following::div[contains(@class, 'remember_field')]/input"));
		rememberMe.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/preceding::div[contains(@class, 'submit_field')]/input"));
		submitButton.click();
	}

}
