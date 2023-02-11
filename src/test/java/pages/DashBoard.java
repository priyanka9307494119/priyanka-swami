package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	public DashBoard (WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}

}
