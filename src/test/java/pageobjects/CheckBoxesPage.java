package pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckBoxesPage extends BasePage {

	public CheckBoxesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Checkboxes']")
	private WebElement buttonCheckBox;

	@FindBy(xpath = "//form[@id='checkboxes']")
	private List<WebElement> checkbox;

	public void clickOnCheckBox() {
		buttonCheckBox.click();
	}

	public void validCheckBox() {
		
		for (WebElement chekBox :checkbox) {
			
			if (chekBox.isSelected()) {
				
				chekBox.click();
				Assert.assertTrue(true);
			}
					
	}

}
}
