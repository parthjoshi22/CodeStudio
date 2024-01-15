package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			// Create object of LoginPage
			LoginPage Loginpg = new LoginPage(driver);
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Loginpg.enterUsername("standard_user");
			Loginpg.enterPassword("secret_sauce");
			Loginpg.clickOnLoginBtn();
	}

}
