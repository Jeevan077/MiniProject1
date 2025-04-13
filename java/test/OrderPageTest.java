package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.CartPage;
import pages.LoginPage;
import pages.OrderPage;
import pages.ProductPage;

public class OrderPageTest extends ProjectSpecificationMethod {

    @Test
    public void testCompleteOrder() {
    	
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
       
       CartPage cart1 = new CartPage(driver);
       cart.placeOrder();
       
        OrderPage order = new OrderPage(driver);
        order.fillOrderDetails("Jeevan Sanjay", "India", "Tamilnadu", "1234567890", "12", "2025");
        order.confirmPurchase();

        // Assuming there is a success message or order confirmation page
        Assert.assertTrue(driver.getCurrentUrl().contains("confirmation"), "Confirmation page should be displayed.");
    }
}

