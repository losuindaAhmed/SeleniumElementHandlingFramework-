package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage {

	public DropDownPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Dropdown']")
	private WebElement dropdownElment;

	@FindBy(xpath = "//select[@id='dropdown']")
	private WebElement dropdownlist;

	public void clickOnDropDownElment() {

		dropdownElment.click();

	}

	public void handleDropDownList() {

		Select item = new Select(dropdownlist);
		item.selectByVisibleText("Option 2");
		Assert.assertEquals("Option 2", item.getFirstSelectedOption().getText());

	}

}
