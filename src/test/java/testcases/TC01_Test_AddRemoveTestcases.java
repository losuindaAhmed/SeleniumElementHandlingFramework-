package testcases;

import org.testng.annotations.Test;

import pageobjects.AddRemoveElements;

public class TC01_Test_AddRemoveTestcases extends BaseTest {

	AddRemoveElements addRElements;

	@Test
	public void testAddElement() {
		addRElements = new AddRemoveElements(driver);
		addRElements.clickonhompageAddRemoveElement();
		addRElements.clickonAddElement();
		addRElements.validateDeleteButtons();

	}

	@Test
	public void AddandRemoveElement() {
		addRElements = new AddRemoveElements(driver);
		addRElements.clickonhompageAddRemoveElement();
		addRElements.clickonAddElement();
		addRElements.removeElemnet();

	}

	@Test
	public void AddMultipleElementsandRemoveOne() {
		addRElements = new AddRemoveElements(driver);
		addRElements.clickonhompageAddRemoveElement();
		addRElements.addMulipleElmentRemoveOne();

	}
}
