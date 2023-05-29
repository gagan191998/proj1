package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	@FindBy(xpath="//input[@id='email']")
	private WebElement emaitxtfld;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwdxtfld;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutn;
	
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public void enteremail(String data)
	{
		emaitxtfld.sendKeys(data);
	}
	public void enterpwd(String data1)
	{
		pwdxtfld.sendKeys(data1);
	}
	public void clickonlogin()
	{
		loginbutn.click();
	}
	
}
