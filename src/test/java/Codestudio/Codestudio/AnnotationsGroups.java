package Codestudio.Codestudio;
import org.testng.annotations.*;
public class AnnotationsGroups {

	@Test(groups = "Software Company")
	public void TCS()
	{
		System.out.println(" TCS");
	}
	@Test(groups = "Auto Company")
	public void Bajaj()
	{
		System.out.println(" Bajaj");
	}
	@Test(groups = "Software Company")
	public void Infosys()
	{
		System.out.println(" Infosys");
	}
	@Test(groups = "Auto Company")
	public void Maruti()
	{
		System.out.println(" Maruti");
	}
}
