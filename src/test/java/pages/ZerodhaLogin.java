package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {
	@FindBy(xpath="//input[@type='test]")
	private WebElement userID;
	
	@FindBy(xpath="//input[@type='password")
	private WebElement password;
    
	@FindBy(xpath="//button[@type='submit")
	private WebElement submitbutton;
	//initialise driver in your class
	public ZerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void lofinfunctionality() throws InterruptedException {
		userID.sendKeys("priya");
		Thread.sleep(3000);
		password.sendKeys("swami");
		Thread.sleep(3000);
		submitbutton.click();
		
	}
}
