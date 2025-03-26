package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	@FindBy (id="ulogin") WebElement semail;
	@FindBy (id="upass") WebElement spaswd;
	@FindBy (id="sub_logbtn") WebElement slogin;


	
	 public loginpage(WebDriver driver) 
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 public void SetValues(String email,String pswd)
	 {
		 semail.clear();
		 semail.sendKeys(email);
		 spaswd.clear();
		 spaswd.sendKeys(pswd);
	 }
	 
	 public void login() throws InterruptedException
	 {
		slogin.click();
		Thread.sleep(2000);
	 }
}


