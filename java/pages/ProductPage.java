package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class ProductPage extends ProjectSpecificationMethod{
    private WebDriver driver;

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
    }
    
    @FindBy(xpath = "//a[contains(text(),'Samsung')]") 
    WebElement productLink;

    
    @FindBy(id = "price") 
    WebElement productPrice;

    @FindBy(xpath = "//div[@id='more-information']/p")
    public WebElement description;
    
    
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;



    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnProduct() {
        productLink.click();
    }
   
 
    public boolean isProductInfoDisplayedCorrectly() {
        return productPrice.isDisplayed() && description.isDisplayed();
    }
    
    public void addToCart() {
        addToCartButton.click();
    }
   
}

