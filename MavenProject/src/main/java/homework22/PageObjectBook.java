package homework22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectBook {
	
	WebDriver driver;
	
	public PageObjectBook(WebDriver driver) {
		this.driver = driver;
		this.driver.navigate().to("https://keybooks.ro/shop/cooking-with-love/");
	}
	
	public By zoom = By.xpath("//a[@class='woocommerce-product-gallery__trigger']");
	public By titleBook = By.xpath("//div[contains(@class,'summary')]/h1[contains(@class, 'product_title')]");
	public By stars = By.xpath("//div[contains(@class,'summary')]/descendant::div[@class='star-rating']");
	public By price = By.xpath("//div[contains(@class,'summary')]/descendant::ins/descendant::bdi/span[contains(@class,'Price')]");
	public By summary = By.xpath("//div[contains(@class,'summary')]/descendant::div/p");
	public By quantity = By.xpath("//div[contains(@class,'summary')]/descendant::div[contains(@class, 'quantity')]/input");
	public By addButton = By.xpath("//div[contains(@class,'summary')]/descendant::button[contains(@class, 'add_to_cart')]");
	public By meta = By.xpath("//div[contains(@class,'summary')]/descendant::div[@class='product_meta']");
	
	public Boolean checkElementIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

}
