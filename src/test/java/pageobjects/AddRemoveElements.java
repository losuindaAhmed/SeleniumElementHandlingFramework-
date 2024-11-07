package pageobjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddRemoveElements extends BasePage {

	public AddRemoveElements(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Add/Remove Elements']")
	private WebElement hompageAddRemoveElement;

	@FindBy(xpath = "//button[normalize-space()='Add Element']")
	private WebElement buttonAddElement;

	@FindBy(xpath = "//div[@id='elements']//button")
	private List<WebElement> deleteButtons;

	public void clickonhompageAddRemoveElement() {
		hompageAddRemoveElement.click();
	}

	public void clickonAddElement() {
		buttonAddElement.click();
	}

	public void addMulipleElmentRemoveOne() {
		for (int i = 0; i <3; i++) {

			buttonAddElement.click();
		}
		deleteButtons.get(0).click();
		Assert.assertEquals(2, deleteButtons.size(), "sucess remove  one  item");
		
		
	}

	public void removeElemnet() {

		while (!deleteButtons.isEmpty()) {
			deleteButtons.get(0).click();
			Assert.assertEquals(0, deleteButtons.size(), "deleteElement was removed");

		}
	}

	public void validateDeleteButtons() {
		if (deleteButtons.size() > 0) {
			Assert.assertTrue(true);

		}

		else {
			Assert.fail();
		}

	}

}
