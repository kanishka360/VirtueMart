package pageHelper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='login-greeting']")
	WebElement greeting;
	
	@FindBy (css="div.vm-search-custom-search-input:nth-child(1) > input.inputbox")
	WebElement textbox;
	
	@FindBy(xpath="//input[@value='Search in shop']")
	WebElement searchBtn;
	
	@FindBy(xpath="//a[text()='Cowboy Hat']")
	WebElement item;
	
	@FindBy(xpath="//div[@class='accept']")
	WebElement iunderstand;
	
	public void verifygreeting() throws Exception {
		Thread.sleep(5000);
		iunderstand.click();
		Assert.assertTrue(greeting.isDisplayed());
		Thread.sleep(5000);
		iunderstand.click();
	}
	
	public void searchhat() throws Exception {
		Thread.sleep(5000);
		iunderstand.click();
		textbox.sendKeys("cowboy hat");
		searchBtn.click();
		item.click();
	}
}
