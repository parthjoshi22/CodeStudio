package Codestudio.Codestudio;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider {

	@Test
	public void GoogleSearchTC()
	{
		String author = "guru99";
	    String searchKey = "india";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("guru99");
		
		driver.findElement(By.name("btnK")).submit();
	}
	
}
