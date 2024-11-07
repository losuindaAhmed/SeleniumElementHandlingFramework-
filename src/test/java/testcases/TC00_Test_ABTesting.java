package testcases;

import org.testng.annotations.Test;

import pageobjects.ABTestingPage;

public class TC00_Test_ABTesting extends BaseTest {

	ABTestingPage abtestingp;

	@Test(priority = 1)
	public void testABTesting() {
		abtestingp = new ABTestingPage(driver);

		abtestingp.clickonABTestLink();

	}

	@Test(priority = 2)
	public void validateSucessRedirecdToABTestingPage() {
		abtestingp = new ABTestingPage(driver);
		abtestingp.validateABTest();

	}
	@Test (priority = 3)
	public void backtohomepage() {
		abtestingp = new ABTestingPage(driver);
		driver.navigate().back();
		
		
	}

}
