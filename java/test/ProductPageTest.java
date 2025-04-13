package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;
import pages.ProductPage;


public class ProductPageTest extends ProjectSpecificationMethod {

    @Test
    public void testAddToCart() {
    	
    	 LoginPage login = new LoginPage(driver);
         login.clicklogin();
         login.enterUsername("Jeevs");
         login.enterPassword("Jee@123");
         login.clickLoginButton();
         
        ProductPage product = new ProductPage(driver);
        product.clickOnProduct();
        product.isProductInfoDisplayedCorrectly();
        product.addToCart();

        // Assuming the cart page is redirected or cart count incremented
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "Cart should be updated.");
    }
}

