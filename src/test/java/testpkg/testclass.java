package testpkg;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Excekutilspkg.Excelutils;
import basepkg.baseclass;
import pagepkg.homepage;
import pagepkg.loginpage;

public class testclass extends baseclass {
@Test
public void verifylogin() throws InterruptedException
{
	loginpage p1=new loginpage(driver);
	String xl="C:\\Users\\hp\\OneDrive\\Desktop\\kerlaprperty.xlsx";
	String Sheet= "Sheet1";
	int rowCount=Excelutils.getRowCount(xl, Sheet);
	
	for(int i=1;i<=rowCount;i++)
	{
		String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
		System.out.println("username---"+UserName);
		String PassWord=Excelutils.getCellValue(xl, Sheet, i, 1);
		System.out.println("password---"+PassWord);
		
		p1.SetValues(UserName, PassWord);
		p1.login();
		
		String exp="https://keralaproperty.in/member/myhome/";
		String act=driver.getCurrentUrl();
		
		
	if(act.equals(exp))
	{
		System.out.println("pass");
		homepage h1=new homepage(driver);
	WebElement logo=h1.verifylogo();
	if(logo.isDisplayed())
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo not presnt");
	}
	
	h1.findmenu();
	h1.view();
	h1.quick();
	h1.back();
	}
	else
	{
		System.out.println("fail");
	}
 
	
	}
}
	
}
