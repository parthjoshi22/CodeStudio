package Codestudio.Codestudio;
import org.testng.annotations.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest {

	@Test
	public void verifyTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.quit();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		driver.quit();
		Thread.sleep(2000);
	}
}

/*<suite name="Suite" parallel="methods" thread-count="2">
  <test name="Test">
    <classes>
      
      <class name="Codestudio.Codestudio.ParallelTest"/>
   
    </classes>   */
