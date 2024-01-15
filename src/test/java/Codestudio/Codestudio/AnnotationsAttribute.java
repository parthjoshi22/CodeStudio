package Codestudio.Codestudio;
import org.testng.annotations.*;
public class AnnotationsAttribute {

	@Test(description = " I am TC 1")
	public void TC1()
	{
		System.out.println(" Mobile Login TC");
	}
	
	@Test(timeOut = 200)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(400);
		System.out.println(" Web Login TC");
	}
	
	@Test(priority=0)
	public void TC3()
	{
		System.out.println(" API Login TC");
	}
}
