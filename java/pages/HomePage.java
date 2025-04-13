package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	
	private WebDriver driver;
	
	@FindBy(id = "signin2")
    private WebElement signUpBtn;

    @FindBy(id = "login2")
    private WebElement loginBtn;


    @FindBy(id = "nameofuser")
    private WebElement welcomeUser;
    
    @FindBy(linkText = "Home")
    WebElement homeMenu;

    @FindBy(linkText = "Contact")
    WebElement contactMenu;
    
    @FindBy(linkText = "Phones")
    WebElement phonesCategory;

    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;
    
    @FindBy(id = "logoId") 
    WebElement logo;

    
    @FindBy(id = "logout2")
    private WebElement logoutBtn;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isSignUpVisible() {
        return signUpBtn.isDisplayed();
    }

    public void clickSignUp() {
        signUpBtn.click();
    }

    public boolean isLoginVisible() {
        return loginBtn.isDisplayed();
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public boolean isWelcomeUserDisplayed() {
        return welcomeUser.isDisplayed();
    }
    
    public boolean areMenuItemsDisplayed() {
        return homeMenu.isDisplayed() && contactMenu.isDisplayed();
    }

    public boolean areCategoriesDisplayed() {
        return phonesCategory.isDisplayed() && laptopsCategory.isDisplayed();
    }
    
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
    
    public void clickLogout() {
        logoutBtn.click();
    }
}

