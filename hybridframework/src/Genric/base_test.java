package Genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_test implements framework_constant {
	WebDriver driver;
	@BeforeMethod
	public void valid() {
		System.setProperty(chrome_key,chrome_value );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get(base_url);
	}
		 
   @AfterMethod
		 public void closeapp(ITestResult res)
		 {
	       if(ITestResult.FAILURE==res.getStatus())
	       {
	    	   Generic_Shot.get
	       }
		  driver.close();
		 }
	     
		
		
		
		
	}
	
	
	
	
	


