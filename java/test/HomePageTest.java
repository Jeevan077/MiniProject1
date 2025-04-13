package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;
import utils.Utility;

public class HomePageTest extends ProjectSpecificationMethod {

    @Test
    public void testSignUpButtonVisibleAndClickable() throws IOException {
        HomePage home = new HomePage(driver);
        try {
            Assert.assertTrue(home.isSignUpVisible(), "Sign up button should be visible.");
            home.clickSignUp();
        } catch (Exception e) {
            Utility screenshotUtil = new Utility();
			screenshotUtil.captureScreenshot(driver, "testSignUpButtonVisibleAndClickable");
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testLoginButtonVisibleAndClickable() throws IOException {
        HomePage home = new HomePage(driver);
        try {
            Assert.assertTrue(home.isLoginVisible(), "Login button should be visible.");
            home.clickLogin();
        } catch (Exception e) {
            Utility screenshotUtil = new Utility();
			screenshotUtil.captureScreenshot(driver, "testLoginButtonVisibleAndClickable");
            Assert.fail("Test failed with exception: " + e.getMessage());
        }
    }
}

