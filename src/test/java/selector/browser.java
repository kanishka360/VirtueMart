package selector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {	
	static WebDriver driver;

	//return type not void as value returning
	public static WebDriver startBrowser(String browsername, String url) 
	{
		if (browsername.equals("chrome"))
		{
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath: "+projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+ "/lib/chromedriver.exe");
			driver=new ChromeDriver();
			
		}

	else if (browsername.equals("firefox"))
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+projectPath);
		System.setProperty("webdriver.firefox.driver", projectPath+ "/lib/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
					
	}

}