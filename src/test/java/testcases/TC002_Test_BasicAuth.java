package testcases;

import org.testng.annotations.Test;

import pageobjects.BasicAuthPage;

public class TC002_Test_BasicAuth extends BaseTest {
	
	BasicAuthPage basicauthpage;
	
	@Test
	public void testBasicAuth() throws InterruptedException {
		basicauthpage=new BasicAuthPage(driver);
		
		basicauthpage.clickOnBasicAuth();
		
	}

}
