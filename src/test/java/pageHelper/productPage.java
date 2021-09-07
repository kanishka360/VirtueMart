package pageHelper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),\"variant \")]")
	WebElement variant;
	
	@FindBy(xpath="//span[@class='PricebasePriceVariant']")
	WebElement price;
	
	@FindBy(xpath="//div[4]//div[2]/span[3]/input")
	WebElement addtocart;
	
	@FindBy(xpath=" a.vm-btn.vm-btn-primary.showcart.floatright:nth-child(2)")
	WebElement showcart;
	
	public void verifyprice() {
		Assert.assertTrue(variant.isDisplayed());
		Assert.assertTrue(price.getText().equals("12,00 €"));
	}
	
	public void addToBasket() {
		addtocart.click();
		showcart.click();
	}
}
