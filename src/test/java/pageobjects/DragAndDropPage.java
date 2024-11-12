package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

	public DragAndDropPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Drag and Drop']")
	private WebElement draganddropelment;

	@FindBy(xpath = "//div[@id='column-a']")
	private WebElement draganddropelmentA;

	@FindBy(xpath = "//div[@id='column-b']")
	private WebElement draganddropelmentB;

	@FindBy(xpath = "//header[normalize-space()='B']")
	private WebElement afterDrag;

	public String validateAfterDrag() {
		return afterDrag.getText();
	}

	public void clickOnDragDropButtton() {

		draganddropelment.click();

	}

	public void handleDragDrop() {
		Actions act = new Actions(driver);
		act.dragAndDrop(draganddropelmentA, draganddropelmentB).build().perform();

	}
}
