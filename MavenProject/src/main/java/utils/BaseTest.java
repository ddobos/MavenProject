package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
	
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://keybooks.ro");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass 
	public void tearTeste() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}

}
