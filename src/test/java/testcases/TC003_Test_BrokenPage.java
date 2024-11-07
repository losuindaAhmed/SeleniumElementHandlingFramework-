package testcases;

import org.testng.annotations.Test;

import pageobjects.BrokenImagePage;

public class TC003_Test_BrokenPage extends BaseTest {

	BrokenImagePage brokenImage;

	@Test
	public void validatTotalNumberofImage() {
		brokenImage = new BrokenImagePage(driver);
		brokenImage.clickOnBrokenImage();
		brokenImage.testImageCount();

	}

}
