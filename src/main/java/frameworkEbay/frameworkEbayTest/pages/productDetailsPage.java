package frameworkEbay.frameworkEbayTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkEbay.frameworkEbayTest.abstractComponent.abstractComponent;

public class productDetailsPage extends abstractComponent {
	
	WebDriver driver;
	public productDetailsPage(WebDriver driver) {
		//first this constructor will get executed
		//initialization
		super(driver);
		this.driver=driver;
		//to utilize the find by we use initElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//span[contains(text(),'Add to cart')]")
	WebElement addToCartButton;
	
	public shoppingCartPage addToCart() {	
		getWindows();
		addToCartButton.click();
		shoppingCartPage cartPage=new shoppingCartPage(driver);
		return cartPage;
	}
}
