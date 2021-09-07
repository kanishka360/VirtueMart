package pageHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement login;
	
	public void loginToApplication(String uid ,String pwd) throws Exception {
		username.sendKeys("demo");
		password.sendKeys("demo");
		login.click();
	}
}
