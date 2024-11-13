package frameworkEbay.frameworkEbayTest.Utility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworkEbay.frameworkEbayTest.pages.homePage;


public class baseClass  {
	public WebDriver driver;
	public homePage homepage;
	
	public WebDriver intitializerDriver() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	

	public homePage launchApplication() throws IOException {
		driver = intitializerDriver();
		homepage = new homePage(driver);
		homepage.goToURL();
		return homepage;

	}
	



}
