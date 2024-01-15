package Codestudio.Codestudio;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(Codestudio.Codestudio.ListenerClass.class)
public class Listner {

		@Test
		public void login() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).submit();
			
			Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		}
		@Test
		public void failedTest()
		{
			System.out.println(" Fail Test");
			Assert.assertTrue(false);
		}
		
		@Test
		public void skipTest()
		{
			System.out.println(" SkipTest");
			throw new SkipException( " Skip Exception thrown");
		}
		
		
}
