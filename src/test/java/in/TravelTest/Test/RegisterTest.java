package in.TravelTest.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import in.TravelTest.Page.RegisterPage;

public class RegisterTest {

    public static void main(String[] args) throws Exception {
        WebDriver w = new ChromeDriver();
        w.get("https://travel-test-bug.vercel.app/");
        RegisterPage rp = new RegisterPage(w);
        Thread.sleep(2000);
        rp.register();
        Thread.sleep(2000);
        rp.enterFullName("Gautam mandal");
        Thread.sleep(2000);
        rp.enterEmail("gautammandal001@yahoo.com");
        Thread.sleep(2000);
        rp.PhoneNumber("9876543210");
        Thread.sleep(2000);
        rp.gender("male");
        Thread.sleep(2000);
        rp.enterPassword("9876543210");
        Thread.sleep(2000);
        rp.clearPassword();
        Thread.sleep(2000);
        rp.enterConfirmPassword("9876543210");
        Thread.sleep(2000);
        rp.registerbutton();
    }
}