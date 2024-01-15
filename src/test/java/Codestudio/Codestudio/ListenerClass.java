package Codestudio.Codestudio;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListenerClass implements ITestListener {
	
	  public void onStart(ITestContext Result)
	  {					
	      System.out.println(" On Start Method Invoke ...");  			
	        		
	    }	
	  
	  public void onFinish(ITestContext Result) 
	  {					
	      System.out.println(" On Finish Method Invoke ...");  			
	        				   		
	    }	
	  
	  public void onFailure(ITestContext Result) 
	  {					
	      System.out.println(" Name of test method fail:" + Result.getName());  			
	        				   		
	    }	
	  
	  public void onSkipped(ITestContext Result) 
	  {					
		  System.out.println(" Name of test method skip:" + Result.getName());  			
	        				   		
	    }	

	  public void onTestStart(ITestContext Result) 
	  {					
		  System.out.println(" Name of test method start:" + Result.getName());  			
	        				   		
	    }	
	  
	  public void onTestSuccess(ITestContext Result) 
	  {					
		  System.out.println(" Name of test method success:" + Result.getName());  			
	        				   		
	    }	

}
