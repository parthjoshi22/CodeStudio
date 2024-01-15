package Codestudio.Codestudio;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
	@Test
	public void testMethod (){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	
	  // Hard Assert Code
	   * 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(" Verifying Title ... ");
		String expectedTitle = "Automation Testing Practice";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle, " Title Verifying");
		
		System.out.println(" Verifying presence of wikipedia icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println(" Verifying presence of wikipedia search button");
		WebElement btn = driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(btn.isDisplayed());
		 
		 */
		
		// Soft Assert
		SoftAssert softVerify = new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println(" Verifying Title ... ");
		String expectedTitle = "Automation Testing Practice XYZ ABC";
		String actualTitle = driver.getTitle();
		softVerify.assertEquals(expectedTitle,actualTitle, " Title Verifying");
		
		System.out.println(" Verifying presence of wikipedia icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softVerify.assertTrue(icon.isDisplayed());
		
		System.out.println(" Verifying presence of wikipedia search button");
		WebElement btn = driver.findElement(By.className("wikipedia-search-button"));
		softVerify.assertTrue(btn.isDisplayed());
		driver.close();
		// Report all failure messages
		softVerify.assertAll();  // These method must write at end if we not write then all test are pass even we put error
			
}
}