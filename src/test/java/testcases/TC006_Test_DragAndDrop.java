package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DragAndDropPage;

public class TC006_Test_DragAndDrop extends BaseTest {

	DragAndDropPage draganddrop;

	@Test
	public void testDragDropFunction() {
		draganddrop = new DragAndDropPage(driver);
		draganddrop.clickOnDragDropButtton();
		draganddrop.handleDragDrop();
		String textAfterDrag=draganddrop.validateAfterDrag();
		System.out.println(textAfterDrag);
		Assert.assertEquals(textAfterDrag,"B");

	}

}
