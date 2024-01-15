package Codestudio.Codestudio;
import org.testng.annotations.*;
public class Parameters {

	@Test
	public void add(int a,int b)
	{
		System.out.println(" a+b ");
	}
	@Test
	public void substraction(int a,int b)
	{
		System.out.println(" a-b ");
	}
	@Test
	public void multiply(int a,int b)
	{
		System.out.println(" a*b ");
	}
}
