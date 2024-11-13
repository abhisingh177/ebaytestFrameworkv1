package frameworkEbay.frameworkEbayTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frameworkEbay.frameworkEbayTest.abstractComponent.abstractComponent;

public class shoppingCartPage extends abstractComponent {
	
	WebDriver driver;
	public shoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		//to utilize the find by we use initElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//i[@id='gh-cart-n']")
	WebElement updatedCart;
	
	public String ItemNumberInCartDetail() {
		String number=updatedCart.getText();
		return number;
	}
	
}
