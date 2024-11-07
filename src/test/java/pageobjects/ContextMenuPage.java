package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {

	public ContextMenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Context Menu']")
	private WebElement contextMenu;

	@FindBy(xpath = "//div[@id='hot-spot']")
	private WebElement box;

	public void clickOncontextMenu() {
		contextMenu.click();
	}

	public void validateContextMenu() {
		Actions action = new Actions(driver);
		action.contextClick(box).perform();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, "You selected a context menu");

	}

}
