package testcases;

import org.testng.annotations.Test;

import pageobjects.CheckBoxesPage;

public class TC004_Test_CheckBoxPage extends BaseTest {

	CheckBoxesPage CheckBoxesPage;

	@Test
	public void testCheckBox() {

		CheckBoxesPage = new CheckBoxesPage(driver);
		CheckBoxesPage.clickOnCheckBox();
		CheckBoxesPage.validCheckBox();

	}

	
}
