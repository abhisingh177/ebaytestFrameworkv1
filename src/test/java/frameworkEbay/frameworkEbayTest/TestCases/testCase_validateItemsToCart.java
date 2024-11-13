package frameworkEbay.frameworkEbayTest.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameworkEbay.frameworkEbayTest.Utility.baseClass;
import frameworkEbay.frameworkEbayTest.pages.homePage;
import frameworkEbay.frameworkEbayTest.pages.productDetailsPage;
import frameworkEbay.frameworkEbayTest.pages.searchResultPage;
import frameworkEbay.frameworkEbayTest.pages.shoppingCartPage;

import java.io.IOException;


public class testCase_validateItemsToCart extends baseClass {
	@Test
	public void TestitemsToCart() throws IOException {
		
		String item="Book";		
		homePage home=launchApplication();
		searchResultPage searchResult=home.searchproduct(item);		
		productDetailsPage productDetail=searchResult.selectFirstProduct();
		shoppingCartPage cartPage=productDetail.addToCart();
		String n=cartPage.ItemNumberInCartDetail();
		System.out.println("Cart Item Count: " + n);
		Assert.assertTrue(Integer.parseInt(n) > 0);


}
}






