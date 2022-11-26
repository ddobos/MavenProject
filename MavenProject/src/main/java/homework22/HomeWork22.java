package homework22;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.BaseTest;

public class HomeWork22 extends BaseTest{

	
	@Test(priority = 1)
	public void homeWork() {
		SoftAssert softAssert = new SoftAssert();
		
		PageObjectBook book = new PageObjectBook(driver);
		
		softAssert.assertTrue(book.checkElementIsDisplayed(book.addButton));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.zoom));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.titleBook));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.quantity));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.price));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.summary));
		softAssert.assertTrue(book.checkElementIsDisplayed(book.meta));
		softAssert.assertAll();
	}
}
