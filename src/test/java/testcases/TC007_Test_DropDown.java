package testcases;

import org.testng.annotations.Test;

import pageobjects.DropDownPage;

public class TC007_Test_DropDown extends BaseTest {

	DropDownPage dropdownpage;

	@Test
	public void testDropDownList() {
		dropdownpage = new DropDownPage(driver);
		dropdownpage.clickOnDropDownElment();
		dropdownpage.handleDropDownList();

	}
}