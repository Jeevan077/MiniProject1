package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;


public class LoginTest extends ProjectSpecificationMethod {

    @Test
    public void testLoginWithValidCredentials() {
        LoginPage login = new LoginPage(driver);
        login.clicklogin();
        login.enterUsername("Jeevs");
        login.enterPassword("Jee@123");
        login.clickLoginButton();
        
        // Assuming you will redirect to dashboard or home page
        Assert.assertTrue(driver.getCurrentUrl().contains("homepage"), "User should be redirected to homepage.");
    }

    @Test
    public void testLoginButtonEnabled() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isLoginButtonEnabled(), "Login button should be enabled.");
    }
}

