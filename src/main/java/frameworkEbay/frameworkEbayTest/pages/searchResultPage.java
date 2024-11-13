package frameworkEbay.frameworkEbayTest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkEbay.frameworkEbayTest.abstractComponent.abstractComponent;

public class searchResultPage extends abstractComponent {

	WebDriver driver;
	public searchResultPage(WebDriver driver) {
		//first this constructor will get executed
		//initialization
		super(driver);
		this.driver=driver;
		//to utilize the find by we use initElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//div[@class='s-item__title'])[3]")
	WebElement firstsearchResults;
	
	@FindBy (xpath ="(//div[@class='s-item__title'])")
	List<WebElement> searchResults;
	
	By resultsBy=By.xpath("(//div[@class='s-item__title'])");
	
	public productDetailsPage selectFirstProduct() {
		//elementToBeClickable(resultsBy);
		firstsearchResults.click();
		productDetailsPage productDetail=new productDetailsPage(driver);
		return productDetail;
	}
	
	public List<WebElement> productList(){
		elementToBeClickable(resultsBy);
		return searchResults;
	}
	
}
