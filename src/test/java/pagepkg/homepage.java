package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class homepage {
	

//WebElement find=driver.findElement(By.xpath("//ul[@class='dropdown-menu']"));
@FindBy (xpath="//ul[@class='dropdown-menu']")  WebElement find;
 //WebElement ekm=driver.findElement(By.xpath("//a[normalize-space()='Ernakulam']"));
 @FindBy (xpath="//a[text()='Ernakulam']")  WebElement ekm;
 //WebElement View=driver.findElement(By.xpath("//div[@class='property-listing']//div[1]//div[1]//a[1]"));
 @FindBy (xpath="//body//div[@class='inner-container']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[1]//a[1]") WebElement view;
 //WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
 @FindBy (xpath="//input[@placeholder='Name']")  WebElement name;

// WebElement phone=driver.findElement(By.xpath("//input[@placeholder='Phone']"));
 @FindBy (xpath="//input[@placeholder='Phone']")  WebElement phone;

// WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
 @FindBy (xpath="//input[@placeholder='Email']")  WebElement email;

 //WebElement logo=driver.findElement(By.xpath("//img[@alt='Kerala Property']]"));
 @FindBy (xpath="//img[@alt='Kerala Property']")  WebElement logo;
 
 @FindBy (xpath="/html/body/header/div[2]/div/a[1]/img")
	WebElement backhomebtn;
 

 WebDriver driver;

public homepage(WebDriver driver) 
{
	this.driver=driver;
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	 PageFactory.initElements(driver, this);
}
 
public void findmenu() throws InterruptedException
{
	
	find.click();
	ekm.click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver). executeScript("window. scrollBy(0, 250);");
}
public void view() throws InterruptedException
{
	
	view.click();
	Thread.sleep(2000);
}
public void quick() throws InterruptedException
{
	Thread.sleep(1000);
	name.sendKeys("Goe");
	phone.sendKeys("9845467841");
	email.sendKeys("gk@yopmail.com");
}
public  WebElement verifylogo()
{
	return logo;
}

public void back() throws InterruptedException
{
	
	backhomebtn.click();

}


}