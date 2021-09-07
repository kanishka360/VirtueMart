package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageHelper.HomePage;
import pageHelper.cartPage;
import pageHelper.loginPage;
import pageHelper.productPage;
import selector.browser;
import utils.constants;

public class purchaseCowboyHat {
	@Test
	public void purchaseCowboyhat() throws Exception{
		//open application url
		WebDriver driver= browser.startBrowser(constants.browser, constants.url);
		//intialize login page
		loginPage loginpage=PageFactory.initElements(driver,loginPage.class);
		//login to application
		loginpage.loginToApplication(constants.user,constants.passwrd);
		
		//intialize home page
		HomePage homepage = PageFactory.initElements(driver,HomePage.class);
		//verify login to application
		homepage.verifygreeting();
		//search cowboyhat 
		homepage.searchhat();
		
		//initialize product page
		productPage productpage = PageFactory.initElements(driver,productPage.class);
		//verify the price
		productpage.verifyprice();
		//add to basket
		productpage.addToBasket();
		
		//intialize cart page
		cartPage cartpage = PageFactory.initElements(driver, cartPage.class);
		//verify the product
		cartpage.verifyproduct();
		//verify no other item is present
		cartpage.deletezipper();
		//confirm purchase
		cartpage.confirmpurchase();
		//logout
		cartpage.logout();
		
		driver.quit();
	}
}
