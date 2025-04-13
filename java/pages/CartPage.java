package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class CartPage extends ProjectSpecificationMethod{
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//h3[@class='totalprice']")
    private WebElement totalPrice;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    private WebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void deleteProduct() {
        deleteButton.click();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void placeOrder() {
        placeOrderButton.click();
    }
}

