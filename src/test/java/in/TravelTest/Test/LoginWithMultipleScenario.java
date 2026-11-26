package in.TravelTest.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import in.TravelTest.Page.LoginPage;

public class LoginWithMultipleScenario {
WebDriver w;
LoginPage lp;

@BeforeMethod
public void precondition()	{
	w = new ChromeDriver();
	w.get("https://travel-test-bug.vercel.app/");
	lp = new LoginPage(w);
}

@Test (priority = 0)
public void checkLoginLink () throws Exception {
	Thread.sleep(2000);
	lp.login();
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/");
}

@Test (priority = 1)
public void LoginWithValidData() throws Exception {

	Thread.sleep(2000);
	SoftAssert soft = new SoftAssert();
	lp.login();
	soft.assertEquals(w.getTitle(), "Login");
	Thread.sleep(2000);
	lp.enterEmail("gautammandal001@yahoo.com");
	Thread.sleep(2000);
	lp.enterPassword("9876543210");
	Thread.sleep(2000);
	lp.rememberMe();
	Thread.sleep(2000);
	lp.loginButton();
	Thread.sleep(5000);	
}

@Test (priority = 2)
public void LoginWithInvalidData() throws Exception {
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.enterEmail("gautammandal000@yahoo.com");
	Thread.sleep(2000);
	lp.enterPassword("9876543210");
	Thread.sleep(2000);
	lp.rememberMe();
	Thread.sleep(2000);
	lp.loginButton();
	Thread.sleep(5000);
}

@Test (priority = 3)
public void forgetPasswordLink() throws Exception {
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.forgetPassword();
	Thread.sleep(5000);
}

@Test (priority = 4)
public void createAnAccountLink() throws Exception {
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.createAnAccount();
}

@AfterMethod
public void CloseAnBrower() throws Exception {
	Thread.sleep(2000);
	w.quit();
}

}
