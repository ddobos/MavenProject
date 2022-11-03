package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExample {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://keybooks.ro");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);//bad practice
	}
}
