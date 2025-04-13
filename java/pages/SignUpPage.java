package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class SignUpPage extends ProjectSpecificationMethod{
	
	private WebDriver driver;
	
	@FindBy(id = "signin2")
	private WebElement signup;
	
	@FindBy(id = "sign-username")
	private WebElement username;
	
	@FindBy(id = "sign-password")
	private WebElement password;
	
	@FindBy(xpath ="//button[text()='Sign up' and @onclick='register()'] ")
	private WebElement signupbtn;
	
	public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }
	
	public void clicksignup() {
		signup.click();
	}
	public void enterdetails (String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
	}
	public HomePage signupbtnclick()
	{
		signupbtn.click();
		return new HomePage (driver);
	}

}
