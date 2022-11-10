package curs19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest{

	@Test(priority = 1)
	public void testFindElements(){
		List<WebElement> listELements = driver.findElements(By.cssSelector("figure[class*='sc_image_shape_square]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'backgroud:green;border: 4px solid red;')", listELements.get(3));
	}
}
