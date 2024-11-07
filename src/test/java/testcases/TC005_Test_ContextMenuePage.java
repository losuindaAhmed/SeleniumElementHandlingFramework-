package testcases;

import org.testng.annotations.Test;

import pageobjects.ContextMenuPage;

public class TC005_Test_ContextMenuePage extends BaseTest {

	ContextMenuPage contextmenupage;

	@Test
	public void TestContextPage() {
		contextmenupage = new ContextMenuPage(driver);
		contextmenupage.clickOncontextMenu();
		contextmenupage.validateContextMenu();

	}

}
