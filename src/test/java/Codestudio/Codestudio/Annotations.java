package Codestudio.Codestudio;
import org.testng.annotations.*;

public class Annotations {

	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println(" Before Suit");
	}
	
	@AfterSuite
	public void AftereSuit()
	{
		System.out.println(" After Suit");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println(" Before Test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println(" After Test");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println(" Before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println(" After Class");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println(" Before Method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println(" After Method");
	}
	
	@Test
	public void TC1()
	{
		System.out.println(" Hey TC1\n");
	}
	
	@Test
	public void TC2()
	{
		System.out.println(" Hey TC2\n");
	}
	
}  
