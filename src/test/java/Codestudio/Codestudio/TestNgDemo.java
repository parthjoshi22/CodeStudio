package Codestudio.Codestudio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;							// Added manully
import org.testng.Assert;                                  // Added manually
public class TestNgDemo {

	@Test
	
	public void verifyPageTitle()         // Non static method
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/" );
		
		String expectedTile = "Google";

		// We call getTitle method, so we get webpage Title in string format & we stored in actualTitle varible
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTile);
		driver.quit();
		
	}
}
