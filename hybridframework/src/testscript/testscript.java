package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric.base_test;
import pomscript.pom;


public class testscript extends base_test{
	private WebDriver driver;
	@Test()
	public void testcase6() throws InterruptedException
	{
	pom p=new pom(driver);
	p.enteremail("");
	p.enterpwd("");
	Thread.sleep(2000);
	p.clickonlogin();
}
	@DataProvider(name="testdata")
	public Object[][]createdata1()
	{
	 return new Object[][] {
		 {"jyothi@gmail.com","123456"},
		 {"sharan@gmail.com","123456"},
	 };
		
	}
	
	
	

}
