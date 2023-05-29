package Genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
	public WebDriver driver;
	public basepage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

}
