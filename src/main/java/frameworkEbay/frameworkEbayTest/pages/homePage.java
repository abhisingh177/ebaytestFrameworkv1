package frameworkEbay.frameworkEbayTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkEbay.frameworkEbayTest.abstractComponent.abstractComponent;

public class homePage extends abstractComponent {
	
	WebDriver driver;
	public homePage(WebDriver driver) {
		//first this constructor will get executed
		//initialization
		super(driver);
		this.driver=driver;
		//to utilize the find by we use initElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='gh-ac']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchButton;
	
	public searchResultPage searchproduct(String item) {
		searchBar.sendKeys(item);
		searchButton.click();
		searchResultPage searchResult=new searchResultPage(driver);
		return searchResult;
	}
	
	public void goToURL(){
		driver.get("https://www.ebay.com/");
		
	}

}
