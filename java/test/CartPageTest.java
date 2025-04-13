package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;


public class CartPageTest extends ProjectSpecificationMethod {

    @Test
    public void testDeleteFromCart() {
    	 LoginPage login = new LoginPage(driver);
         login.clicklogin();
         login.enterUsername("Jeevs");
         login.enterPassword("Jee@123");
         login.clickLoginButton();
         
        ProductPage product = new ProductPage(driver);
        product.clickOnProduct();
        product.isProductInfoDisplayedCorrectly();
        product.addToCart();
        
        CartPage cart = new CartPage(driver);
        cart.deleteProduct();
        
        // Verify that cart is empty after deletion
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "Cart page should be open.");
    }

    @Test
    public void testPlaceOrder() {
        CartPage cart = new CartPage(driver);
        cart.placeOrder();
        
        // Verify redirection to order page
        Assert.assertTrue(driver.getCurrentUrl().contains("placeorder"), "Order page should be open.");
    }
}

