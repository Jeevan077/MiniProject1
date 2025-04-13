package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.SignUpPage;

public class SignupPageTest extends ProjectSpecificationMethod {

	@Test
	public  void TestSignuppage() {
		
		SignUpPage SignUp = new SignUpPage(driver);
		SignUp.clicksignup();
		SignUp.enterdetails("Jeevs", "Jee@123");
		SignUp.signupbtnclick();

	}

}
