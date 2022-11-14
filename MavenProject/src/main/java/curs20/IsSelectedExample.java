package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelectedExample extends BaseTest {

	
	@Test
	public void isSelected() {
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']")).click();
		
		WebElement userName = driver.findElement(By.cssSelector("div>input[id='log']"));
		userName.isSelected(); // tot tipul v-a returna false
		WebElement rememberMe = driver.findElement(By.cssSelector("div>input[id='rememberme']"));
		
		rememberMe.isSelected(); // la selectare v-a returna true, in caz contrat false
		
		
		
	}
}
