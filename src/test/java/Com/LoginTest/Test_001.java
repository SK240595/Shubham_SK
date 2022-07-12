package Com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Test_001 extends BaseClass {
	
	@Test
	public void verifyLoginpage() throws InterruptedException {
		
		
   LoginPom login =	PageFactory.initElements(driver, LoginPom.class);
		
		
		Library.sendCustomKeys(login.gettxt_email(),excel.getDataProvider("Sheet1", 0, 0));
		Library.sendCustomKeys(login.getttxt_password(),excel.getDataProvider("Sheet1", 0, 1));
		
		Library.Click_method(login.getlogin_btn());
				
		Thread.sleep(2000);
	}
}
