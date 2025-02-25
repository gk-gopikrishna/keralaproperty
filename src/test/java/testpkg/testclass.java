package testpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.homepage;

public class testclass extends baseclass {
@Test
public void kerala()
{
	homepage h1=new homepage(driver);
	driver.getTitle();
	h1.findmenu();
	h1.quick();
	h1.view();
	h1.quick();
	h1.logo();
	}
 
	
	
	
}
