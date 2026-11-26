package in.TravelTest.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	WebDriver w;

	public RegisterPage(WebDriver wd) {
		System.out.println(wd);
		w =wd;

	}
	
//	Locator
	By fullName = By.id("register-full-name-input");
	By email = By.name("email");
	By phoneNumber = By.cssSelector("input[data-testid=\"register-phone-input\"]");
	By gender = By.name("gender");
	By password = By.xpath("//input[@id=\"register-password-input\"]");
	By confirmPassword = By.id("register-confirm-password-input");
	By termAndCondition = By.id("register-terms-checkbox");
	By registerButton = By.cssSelector("button[data-testid=\"register-submit-button\"]");
	By loginLink = By.cssSelector("a[data-testid=\"register-login-link\"]");
	By RegisterHome = By.cssSelector("a[data-testid=\"nav-register-link\"]");
//	Actions ---> methods
	
	
//	HomePage Register
	public void register() {
		w.findElement(RegisterHome).click();
	}
	
	
//	Full name
	public void enterFullName(String fullName) {
		w.findElement(this.fullName).sendKeys(fullName);
	}
	
	public void clearFullName() {
		w.findElement(this.fullName).clear();
	}
	
//	email
	public void enterEmail(String Email) {
		w.findElement(email).sendKeys(Email);
	}
	
	public void clearEmail() {
		w.findElement(email).clear();
	}
	
//	phone NUmber
	public void PhoneNumber(String PhoneNumber) {
	    w.findElement(phoneNumber).sendKeys(PhoneNumber);
	}

	public void clearPhoneNumber() {
	    w.findElement(phoneNumber).clear();
	}
	
	
	// gender
	public void gender(String Gender) {
	    List<WebElement> genders = w.findElements(gender);
	    for (int i = 0; i < genders.size(); i++) {
	        if (Gender.equalsIgnoreCase("female")) {
	            genders.get(0).click();
	        } else if (Gender.equalsIgnoreCase("male")) {
	            genders.get(1).click();
	        } else if (Gender.equalsIgnoreCase("Other")) {
	            genders.get(2).click();
	        }
	    }
	}

	
	// password
	public void enterPassword(String Password) {
	    w.findElement(password).sendKeys(Password);
	}

	public void clearPassword() {
	    w.findElement(password).clear();
	}

	// confirm password
	public void enterConfirmPassword(String ConfirmPassword) {
	    w.findElement(confirmPassword).sendKeys(ConfirmPassword);
	}

	public void clearConfirmPassword() {
	    w.findElement(confirmPassword).clear();
	}
	
	// term and Condition
	public void termAndCondition() {
	    w.findElement(termAndCondition).click();
	}

	// Register
	public void registerbutton() {
	    w.findElement(registerButton).click();
	}

	// login link
	public void loginLink() {
	    w.findElement(loginLink).click();
	}	
}