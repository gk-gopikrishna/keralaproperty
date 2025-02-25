package pagepkg;

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
 @FindBy (xpath="///body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")  WebElement view;

 //WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
 @FindBy (xpath="//input[@placeholder='Name']")  WebElement name;

// WebElement phone=driver.findElement(By.xpath("//input[@placeholder='Phone']"));
 @FindBy (xpath="//input[@placeholder='Phone']")  WebElement phone;

// WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
 @FindBy (xpath="//input[@placeholder='Email']")  WebElement email;

 //WebElement logo=driver.findElement(By.xpath("//img[@alt='Kerala Property']]"));
 @FindBy (xpath="//img[@alt='Kerala Property']]")  WebElement logo;
 

 WebDriver driver;

public homepage(WebDriver driver) 
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
 
public void findmenu()
{
	
	find.click();
	ekm.click();
}
public void view()
{
	((JavascriptExecutor) driver). executeScript("window. scrollBy(0, 250);");
	view.click();
}
public void quick()
{
	name.sendKeys("Goe");
	phone.sendKeys("9845467841");
	email.sendKeys("gk@yopmail.com");
}
public void logo()
{
	if(logo.isDisplayed())
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo not presnt");
	}

}



}