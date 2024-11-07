package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ABTestingPage extends BasePage {

	public ABTestingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='A/B Testing']")
	private WebElement link_abTesting;

	@FindBy(xpath = "//p[contains(text(),'Also known as split testing. This is a way in whic')]")
	private WebElement descripeabtesting;

	public void clickonABTestLink() {
		link_abTesting.click();
	}

	public void validateABTest() {
		if (descripeabtesting.isDisplayed() == true) {
			Assert.assertTrue(true);
		}

		else {
			Assert.fail();

		}

	}

}
