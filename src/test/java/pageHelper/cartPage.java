package pageHelper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'12,00 €')]")
	WebElement price;
	
	@FindBy(xpath="//td[4]/input[1]")
	WebElement number;
	
	@FindBy(xpath="//span[text()='49,17 €']")
	WebElement zipper;
	
	@FindBy(xpath="//button[@name='delete.0']")
	WebElement zipperdelete;
	
	@FindBy(xpath="//input[@class='terms-of-service required']")
	WebElement terms;
	
	@FindBy(xpath="//span[contains(text(),'Confirm Purchase')]")
	WebElement confirmpurchase;
	
	@FindBy(xpath="//input[@value='Logout']")
	WebElement logout;
	
	public void verifyproduct() {
		Assert.assertTrue(price.getText().equals("12,00 €"));
		number.sendKeys("1");
	}
	
	public void confirmpurchase() {
		terms.click();
		confirmpurchase.click();
	}
	
	public void deletezipper() {
		Assert.assertTrue(zipper.isDisplayed());
		zipperdelete.click();
	}
	
	public void logout() {
		logout.click();
	}
}
