package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys("standard_user");
			
			driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("secret_sauce");
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

}
