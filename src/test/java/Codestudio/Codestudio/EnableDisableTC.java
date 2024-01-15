package Codestudio.Codestudio;

import org.testng.annotations.Test;

public class EnableDisableTC {

	@Test(enabled = false)
	public void MobileLoginPersonalLoan()
	{
		System.out.println(" Mobile Login Personal Loan");
	}
	
	@Test(enabled = false)
	public void WebLoginPersonalLoan()
	{
		System.out.println(" Web Login Personal Loan");
	}
	
	@Test(enabled = false)
	public void APILoginPersonalLoan()
	{
		System.out.println(" API Login Personal Loan");
	}
	
	@Test
	public void MobileLoginAutoLoan()
	{
		System.out.println(" Mobile Login Auto Loan");
	}
	
	@Test
	public void WebLoginAutoLoan()
	{
		System.out.println(" Web Login Auto Loan");
	}
	
	@Test
	public void APILoginAuoLoan()
	{
		System.out.println(" API Login Auto Loan");
	}
	
}
